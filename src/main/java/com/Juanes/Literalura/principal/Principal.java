package com.Juanes.Literalura.principal;

import com.Juanes.Literalura.entities.DatosAutor;
import com.Juanes.Literalura.entities.DatosLibro;
import com.Juanes.Literalura.entities.Libro;
import com.Juanes.Literalura.repository.AutorRepository;
import com.Juanes.Literalura.repository.LibroRepository;
import com.Juanes.Literalura.services.ConsumoApi;
import com.Juanes.Literalura.services.ConvierteDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoApi consumoApi = new ConsumoApi();
    private final String URL_BASE = "https://gutendex.com/books/";
    private ConvierteDatos conversor = new ConvierteDatos();
    private List<DatosAutor> datosSeries = new ArrayList<>();
    private AutorRepository repositorioAutores;
    private List<DatosLibro> datosLibros = new ArrayList<>();
    private LibroRepository repositorioLibros;
    private List<Libro> Libros;

public Principal (AutorRepository repositorioAutores){
    this.repositorioAutores = repositorioAutores;
}
public Principal (LibroRepository repositorioLibros){
    this.repositorioLibros = repositorioLibros;
}
    public void muestraElMenu() {
        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    --------- Bienvenido a Literalura ------------
                    1 - Buscar libro por titulo 
                    2 - Listar todos los libros
                    3 - Lista de autores
                    4 - Listar autores desde un determinado año
                    5 - Listar libros por idioma     
                    0 - Salir
                    ---------- Elige una opcion ---------------
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:
                    buscarLibroPorTitulo();
                    break;
                case 2:
                    getAllBooks();
                    break;
                case 3:
                    getAllAuthors();
                    break;
                case 4:
                    getAllAuthorsYear();
                    break;
                case 5:
                    getBooksLanguage();
                    break;
                case 6:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }

    }
    private void buscarLibroPorTitulo(){
        System.out.println("Escribe el nombre del libro que deseass buscar: ");
        var nombreLibro = teclado.nextLine();
        var json = consumoApi.obtenerDatos(URL_BASE+nombreLibro);
        DatosLibro datos = conversor.obtenerDatos(json,DatosLibro.class);
        System.out.println(
                """
                -------- Libro --------
                Titulo:
                Autor:
                Idioma:
                Numero de descargas:        
                        """
        );
    }

    private void getAllBooks(){
        var json = consumoApi.obtenerDatos(URL_BASE+"books");
        DatosLibro datos = conversor.obtenerDatos(json,DatosLibro.class);
        System.out.println(
                """
                -------- Libro --------
                Titulo:
                Autor:
                Idioma:
                Numero de descargas:        
                        """
        );
    }

    private void getAllAuthors(){
        System.out.println(
                """
                Autor:
                Fecha de nacimiento:
                Fecha de fallecimiento:
                Libros:        
                        """
        );
    }

    private void getAllAuthorsYear(){
        System.out.println("Ingrese el año en el que desea buscar el autor: ");
        var año = teclado.nextInt();
        System.out.println(
                """
                Autor:
                Fecha de nacimiento:
                Fecha de fallecimiento:
                Libros:        
                        """
        );
    }

    private void getBooksLanguage(){
        System.out.println(
                """
                Ingrese el idioma para buscar los libros:
                es - Español
                en - Ingles
                fn - Frances
                pr - Portugues        
                        """
        );
    }



}
