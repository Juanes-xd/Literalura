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

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 0:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }

    }





}
