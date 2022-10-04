package b_architektur.adapter.zaehler;

import b_architektur.domain.model.Kundennummer;
import b_architektur.domain.service.ZaehlerRepository;
import jakarta.ejb.Stateless;

@Stateless
public class ZaehlerSapRepository implements ZaehlerRepository {

    @Override
    public Kundennummer getNextKundennummer() {
        return null;
    }
}
