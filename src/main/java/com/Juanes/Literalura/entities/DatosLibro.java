package com.Juanes.Literalura.entities;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro(
        @JsonAlias("id") Long id,
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") Autor autor,
        @JsonAlias("languages") String idioma,
        @JsonAlias("download_count") Long descargas
) {
}
