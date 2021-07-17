package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class TouadiNesserineActivity10Application implements CommandLineRunner{


	@Autowired
	PatientRepository patientRepository; 
	
	public static void main(String[] args) {
		SpringApplication.run(TouadiNesserineActivity10Application.class, args);
	}

	
	
	@Override
	public void run(String... args) throws Exception {
		// récupérer tous les enregistrements sous forme d’objets et les afficher 
		
		System.out.println("\n\nAffichage des enregistrement :\n");
		
		List <Patients>list_patient=patientRepository.findAll();
		list_patient.forEach(pat->System.out.println(pat+"\n"));
	
		
	}

}
