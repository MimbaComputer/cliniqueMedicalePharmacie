package org.mimba.bao.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
public class Client implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Size(min = 3, max = 30)
	private String nom;
	@NotNull
	@Size(min = 3, max = 50)
	private String adresse;
	@Email
	@Size(min = 3, max = 50)
	private String email;
	@NotNull
	@Size(max = 30)
	private String telephone;
	@OneToMany(mappedBy="client")
	private Collection<Commande> commandes;
	

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Client(String nom, String adresse, String email, String telephone) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.email = email;
		this.telephone = telephone;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public Collection<Commande> getCommandes() {
		return commandes;
	}


	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}

	
}
