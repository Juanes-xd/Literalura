package com.Juanes.Literalura.entities;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro(
        @JsonAlias("id") Long id,
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") ArrayList<Autor> autor,
        @JsonAlias("languages") ArrayList<String> idioma,
        @JsonAlias("download_count") Long descargas
) {
}
