package org.mimba.bao.dao;

import org.mimba.bao.entities.Client;
import org.mimba.bao.entities.Commande;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IClientRepository extends JpaRepository<Client, Long> {
	@Query("select c from Client c where c.nom like:mc")
	public Page<Client> clientParMC(@Param("mc") String mc, Pageable pageable);

	public Page<Client> findById(@Param("id") Long id, Pageable pageable);

	public Page<Client> findByNom(@Param("nom") String nom, Pageable pageable);

	public Page<Client> findByEmail(@Param("email") String email, Pageable pageable);

	@Query("select c from Client c where c.email like:mc")
	public Page<Client> clientEmailParMC(@Param("mc") String mc, Pageable pageable);

	public Page<Client> findByAdresse(@Param("adresse") String adresse, Pageable pageable);

	@Query("select c from Client c where c.adresse like:mc")
	public Page<Client> clientAdresseParMC(@Param("mc") String mc, Pageable pageable);

	public Page<Client> findByTelephone(@Param("telephone") String telephone, Pageable pageable);

	@Query("select c from Client c where c.telephone like:mc")
	public Page<Client> clientTelephoneParMC(@Param("mc") String mc, Pageable pageable);
	
	@Query("select c from Commande c where c.client.id=:idClient")
	public Page<Commande> listeCommandeClient(@Param("idClient") Long idClient, Pageable pageable);

}
