package b_architektur.domain.service;

import b_architektur.domain.model.Kundennummer;

public interface ZaehlerRepository {
    Kundennummer getNextKundennummer();
}
