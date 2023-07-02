package org.br.mineradora.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.br.mineradora.entity.QuotationEntity;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped //Diz ao framework que esta classe será gerenciada por ele.  Ele
// cuidará de todo o seu ciclo de vida
public class QuotationRepository implements PanacheRepository<QuotationEntity> {
//lembrando que o PanacheRepository funciona de forma muito parecida ao JpaRepository
// do Spring

}
