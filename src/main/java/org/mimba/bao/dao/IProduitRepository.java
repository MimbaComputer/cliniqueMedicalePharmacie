package org.mimba.bao.dao;

import org.mimba.bao.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IProduitRepository extends JpaRepository<Produit, Long> {
	@Query("select p from Produit p where p.nom like:mc or p.description like:mc")
	public Page<Produit> produitParMC(@Param("mc") String mc, Pageable pageable);

	public Page<Produit> findById(@Param("id") Long id, Pageable pageable);

	public Page<Produit> findByNom(@Param("nom") String nom, Pageable pageable);

	public Page<Produit> findByPrix(@Param("prix") double prix, Pageable pageable);

	public Page<Produit> findBySelectionner(@Param("selectionner") boolean selectionner, Pageable pageable);

	@Query("select p from Produit p where p.prix>=:x  and p.prix<=:y")
	public Page<Produit> produitPrixParIntervale(@Param("x") double x, @Param("y") double y, Pageable pageable);

	public Page<Produit> findByQuantite(@Param("quantite") int quantite, Pageable pageable);

	@Query("select p from Produit p where p.quantite>=:x and p.quantite<=:y")
	public Page<Produit> produitQuantiteParIntervale(@Param("x") int x, @Param("y") int y, Pageable pageable);
}
