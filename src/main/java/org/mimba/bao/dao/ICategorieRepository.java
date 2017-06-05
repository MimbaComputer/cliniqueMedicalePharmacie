package org.mimba.bao.dao;

import org.mimba.bao.entities.Categorie;
import org.mimba.bao.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ICategorieRepository extends JpaRepository<Categorie, Long> {
	@Query("select c from Categorie c where c.nom like:mc")
	public Page<Categorie> categorieParMC(@Param("mc") String mc, Pageable pageable);

	public Page<Categorie> findByNom(@Param("nom") String nom, Pageable pageable);

	public Page<Categorie> findById(@Param("id") Long id, Pageable pageable);

	@Query("select c from Categorie c where c.description like:mc")
	public Page<Categorie> categorieDescriptionParMC(@Param("mc") String mc, Pageable pageable);

	@Query("select p from Produit p where p.categorie.id=:idCategorie")
	public Page<Produit> listeProduitCategorie(@Param("idCategorie") Long idCategorie, Pageable pageable);

}
