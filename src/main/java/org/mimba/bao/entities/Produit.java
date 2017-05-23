package org.mimba.bao.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Produit implements Serializable{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Size(min=3, max=30)
	private String nom;
	@NotNull
	@Size(min=5, max=50)
	private String description;
	@NotNull
	private double pix;
	@NotNull
	private int quantite;
	private boolean selectionner;
	@Size(min=3, max=30)
	private String nomPhoto;
	@ManyToOne
	@JoinColumn(name="idCategorie")
	private Categorie categorie;
	@OneToMany(mappedBy="produit")
	private Collection<LigneCommande> ligneCommandes;

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPix() {
		return pix;
	}

	public void setPix(double pix) {
		this.pix = pix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public boolean isSelectionner() {
		return selectionner;
	}

	public void setSelectionner(boolean selectionner) {
		this.selectionner = selectionner;
	}

	public String getNomPhoto() {
		return nomPhoto;
	}

	public void setNomPhoto(String nomPhoto) {
		this.nomPhoto = nomPhoto;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Produit(String nom, String description, double pix, int quantite, boolean selectionner, String nomPhoto) {
		super();
		this.nom = nom;
		this.description = description;
		this.pix = pix;
		this.quantite = quantite;
		this.selectionner = selectionner;
		this.nomPhoto = nomPhoto;
	}

	public Collection<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}

	public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}

	

}