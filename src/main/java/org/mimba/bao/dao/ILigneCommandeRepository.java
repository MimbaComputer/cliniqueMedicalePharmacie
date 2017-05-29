package org.mimba.bao.dao;

import org.mimba.bao.entities.LigneCommande;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ILigneCommandeRepository extends JpaRepository<LigneCommande, Long> {

	public Page<LigneCommande> findById(@Param("id") Long id, Pageable pageable);

	public Page<LigneCommande> findByQuantite(@Param("quantite") int quantite, Pageable pageable);

	public Page<LigneCommande> findByPrix(@Param("prix") double prix, Pageable pageable);

	@Query("select l from LigneCommande l where l.prix>=:x  and l.prix<=:y")
	public Page<LigneCommande> ligneCommandePrixParIntervale(@Param("x") double x, @Param("y") double y,
			Pageable pageable);

	@Query("select l from LigneCommande l where l.quantite>=:x  and l.quantite<=:y")
	public Page<LigneCommande> ligneCommandeQuantiteParIntervale(@Param("x") double x, @Param("y") double y,
			Pageable pageable);

	@Query("select l from LigneCommande l where l.commande.id=:idCommande")
	public Page<LigneCommande> listeLigneCommandeCommande(@Param("idCommande") Long idCommande, Pageable pageable);

	@Query("select l from LigneCommande l where l.produit.id=:idProduit")
	public Page<LigneCommande> listeLigneCommandeProduit(@Param("idProduit") Long idProduit, Pageable pageable);

}
