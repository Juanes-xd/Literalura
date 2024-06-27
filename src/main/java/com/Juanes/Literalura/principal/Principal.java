package com.Juanes.Literalura.principal;

import com.Juanes.Literalura.services.ConsumoApi;

import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoApi consumoApi = new ConsumoApi();
    private final String URL_BASE = "https://gutendex.com/books/";



    public void muestraElMenu() {
        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    --------- Bienvenido a Literalura ------------
                    1 - Buscar libro por titulo 
                    2 - Listar todos los libros
                    3 - Lista de autores
                    4 - Listar autores desde un determinado año
                    5 - Listar libros de un determinado idioma     
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
                case 0:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }

    }





}
