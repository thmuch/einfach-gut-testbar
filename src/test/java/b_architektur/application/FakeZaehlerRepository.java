package b_architektur.application;

import b_architektur.domain.model.Kundennummer;
import b_architektur.domain.service.ZaehlerRepository;

public class FakeZaehlerRepository implements ZaehlerRepository {
    @Override
    public Kundennummer getNextKundennummer() {
        return new Kundennummer(1234L);
    }
}
