//package com.br.alura.screenmatch;

//import com.br.alura.screenmatch.principal.Principal;
//import com.br.alura.screenmatch.repository.SerieRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class ScreenmatchApplicationSemWeb implements CommandLineRunner {
//
//	private final SerieRepository repository;
//
//	public ScreenmatchApplicationSemWeb(SerieRepository repository) {
//		this.repository = repository;
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(ScreenmatchApplicationSemWeb.class, args);
//	}
//
//	@Override
//	public void run(String... args) {
//		Principal principal = new Principal(repository );
//		principal.exibeMenu();
//	}
//}
