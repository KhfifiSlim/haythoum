package com.slim.buggys.entities;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Buggy {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idBuggy;
private String nomBuggy;
private Double prixBuggy;
private Date dateCreation;

@ManyToOne
private Marque marque;

public Buggy() {
super();
}
public Buggy(String nomBuggy, Double prixBuggy, Date dateCreation) {
super();
this.nomBuggy = nomBuggy;
this.prixBuggy = prixBuggy;
this.dateCreation = dateCreation;
}

public Long getIdBuggy() {
	return idBuggy;
	}
	public void setIdBuggy(Long idBuggy) {
	this.idBuggy = idBuggy;
	}
	public String getNomBuggy() {
	return nomBuggy;
	}
	public void setNomBuggy(String nomBuggy) {
	this.nomBuggy = nomBuggy;
	}
	public Double getPrixBuggy() {
	return prixBuggy;
	}
	public void setPrixBuggy(Double prixBuggy) {
	this.prixBuggy = prixBuggy;
	}
	public Date getDateCreation() {
	return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
	}
	@Override
	public String toString() {
	return "Buggy [idBuggy=" + idBuggy + ", nomBuggy=" +

	nomBuggy + ", prixBuggy=" + prixBuggy

	+ ", dateCreation=" + dateCreation + "]";

	}
	public Marque getMarque() {
		return marque;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	}
