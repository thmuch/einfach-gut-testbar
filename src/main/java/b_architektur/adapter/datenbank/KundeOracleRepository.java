package b_architektur.adapter.datenbank;

import b_architektur.domain.model.Kunde;
import b_architektur.domain.service.KundeRepository;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class KundeOracleRepository implements KundeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(Kunde kunde) {
        entityManager.persist(kunde);
    }
}
