package com.Juanes.Literalura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class LiteraluraApplication {

	public static void main(String[] args) {

		// Cargar variables de entorno
		Dotenv dotenv = Dotenv.configure()
				.directory("./") // Directorio donde está el archivo .env
				.load();

		// Variables se cargan automáticamente en el sistema
		System.setProperty("SPRING_DATASOURCE_URL", dotenv.get("SPRING_DATASOURCE_URL"));
		System.setProperty("SPRING_DATASOURCE_USERNAME", dotenv.get("SPRING_DATASOURCE_USERNAME"));
		System.setProperty("SPRING_DATASOURCE_PASSWORD", dotenv.get("SPRING_DATASOURCE_PASSWORD"));

		SpringApplication.run(LiteraluraApplication.class, args);
	}

}
