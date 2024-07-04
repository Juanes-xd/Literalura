package com.Juanes.Literalura.entities;


import jakarta.persistence.*;

import java.util.ArrayList;


@Entity
@Table(name = "Libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    @ManyToOne
    private ArrayList<Autor> autor;
    private ArrayList<String> idioma;
    private Long descargas;

    public Libro (){

    }

    public Libro (DatosLibro datosLibro){
       this.id = datosLibro.id();
       this.titulo = datosLibro.titulo();
       this.autor = datosLibro.autor();
       this.idioma = datosLibro.idioma();
       this.descargas = datosLibro.descargas();


    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor.get(0);
    }

    public void setAutor(ArrayList<Autor> autor) {
        this.autor = autor;
    }

    public String getIdioma() {
        return idioma.get(0);
    }

    public void setIdioma(ArrayList<String> idioma) {
        this.idioma = idioma;
    }

    public Long getDescargas() {
        return descargas;
    }

    public void setDescargas(Long descargas) {
        this.descargas = descargas;
    }
}
