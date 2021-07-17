package com.example.demo;


import org.springframework.data.annotation.Id;

import java.sql.Date;
import org.bson.types.ObjectId;

public class Patients {
	
	@Id
	private ObjectId _id;
	private String nom;
	private String prenom;
	private String sexe;
	private Date date;
	
	public Patients() {
		super();
		
	}
	
	public Patients(ObjectId id, String nom, String prenom, String sexe, Date date) {
		super();
		this._id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.date = date;
	}


	public ObjectId getId() {
		return _id;
	}


	public void setId(ObjectId id) {
		this._id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getSexe() {
		return sexe;
	}


	public void setSexe(String sexe) {
		this.sexe = sexe;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Patient [id=" + _id + ", nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe + ", Date=" + date + "]";
	}
	
	
	
}
