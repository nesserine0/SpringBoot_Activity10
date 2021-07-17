package com.example.demo;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;


public interface PatientRepository extends MongoRepository<Patients, Integer>{
	
	List<Patients> findAll() ;
	
}
