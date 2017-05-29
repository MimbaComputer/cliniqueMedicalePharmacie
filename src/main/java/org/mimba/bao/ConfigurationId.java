package org.mimba.bao;

import org.mimba.bao.entities.Produit;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
public class ConfigurationId extends RepositoryRestMvcConfiguration {

	@Override
	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Produit.class);

	}
}

//@Configuration
// class ConfigurationId1 extends RepositoryRestMvcConfiguration {
//
//	@Override
//	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
//
//		config.exposeIdsFor(Categorie.class);
//
//	}
//}
//
//@Configuration
//class ConfigurationId2 extends RepositoryRestMvcConfiguration {
//
//	@Override
//	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
//
//		config.exposeIdsFor(Client.class);
//
//	}
//}
//
//@Configuration
//class ConfigurationId3 extends RepositoryRestMvcConfiguration {
//
//	@Override
//	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
//
//		config.exposeIdsFor(Commande.class);
//
//	}
//}
//
//@Configuration
//class ConfigurationId4 extends RepositoryRestMvcConfiguration {
//
//	@Override
//	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
//
//		config.exposeIdsFor(LigneCommande.class);
//	}
//}
