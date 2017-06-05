package org.mimba.bao.dao;


import org.mimba.bao.entities.Commande;
import org.mimba.bao.entities.LigneCommande;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ICommandeRepository extends JpaRepository<Commande, Long> {
	
	public Page<Commande> findById(@Param("id") Long id, Pageable pageable);
    
	public Page<Commande> findByDate(@Param("date") String date, Pageable pageable);
    
	@Query("select c from Commande c where c.client.id=:idClient")
	public Page<Commande> listeCommandeClient(@Param("idClient") Long idClient, Pageable pageable);
	
	@Query("select l from LigneCommande l where l.commande.id=:idCommande")
	public Page<LigneCommande> listeLigneCommandeCommande(@Param("idCommande") Long idCommande, Pageable pageable);

	@Query("select c from Commande c where c.date like:mc")
	public Page<Commande> commandeDateParMC(@Param("mc") String mc, Pageable pageable);
	
}
