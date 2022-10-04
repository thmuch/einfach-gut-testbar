package b_architektur.application;

import b_architektur.domain.model.Email;
import b_architektur.domain.model.Kunde;
import b_architektur.domain.service.KundeRepository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FakeKundeRepository implements KundeRepository {

    private final Map<Email, Kunde> fakeDb = new ConcurrentHashMap<>();

    @Override
    public void add(Kunde kunde) {
        fakeDb.put(kunde.getEmail(), kunde);
    }

    public Map<Email, Kunde> getFakeDb() {
        return fakeDb;
    }
}
