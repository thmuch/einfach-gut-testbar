package b_architektur.application;

import b_architektur.domain.model.Email;
import b_architektur.domain.model.Kunde;
import b_architektur.domain.model.Kundennummer;
import b_architektur.domain.service.KundeRepository;
import b_architektur.domain.service.ZaehlerRepository;
import jakarta.inject.Inject;

public class NeuesKundenkontoAnlegenUseCase {

    private ZaehlerRepository zaehlerRepository;
    private KundeRepository kundeRepository;

    @Inject
    public NeuesKundenkontoAnlegenUseCase(ZaehlerRepository zaehlerRepository, KundeRepository kundeRepository) {
        this.zaehlerRepository = zaehlerRepository;
        this.kundeRepository = kundeRepository;
    }

    public void neuesKundenkontoAnlegen(Email email) {

        Kundennummer kundennummer = zaehlerRepository.getNextKundennummer();

        Kunde kunde = new Kunde(kundennummer, email);

        kundeRepository.add(kunde);
    }
}
