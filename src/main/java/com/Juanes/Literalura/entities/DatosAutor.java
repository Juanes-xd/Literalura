package com.Juanes.Literalura.entities;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAutor(
        @JsonAlias("name") String titulo,
        @JsonAlias("birth_year") int fechaNacimiento,
        @JsonAlias("death_year") int fechaFallecimiento
) {
}
