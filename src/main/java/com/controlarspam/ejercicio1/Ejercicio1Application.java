package com.controlarspam.ejercicio1;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.controlarspam.ejercicio1.Control_de_acceso.SpamFilterService;
import com.controlarspam.ejercicio1.Interfaz_grafica.SpamFilterApp;

import javax.swing.*;

@SpringBootApplication
public class Ejercicio1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1Application.class, args);
	}

	@Bean
CommandLineRunner init(SpamFilterService spamFilterService) {
	return args -> SwingUtilities.invokeLater(() -> {
		new SpamFilterApp(spamFilterService);
	});
}
}


