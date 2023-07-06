package b_architektur.application;

import b_architektur.domain.model.Kundennummer;
import b_architektur.domain.service.ZaehlerRepository;

import java.util.concurrent.atomic.AtomicLong;

public class FakeZaehlerRepository implements ZaehlerRepository {

    private final AtomicLong zaehler = new AtomicLong(1000L);

    @Override
    public Kundennummer getNextKundennummer() {
        return new Kundennummer(zaehler.incrementAndGet());

        // oder einfach einen festen Wert liefern ("stub" statt "fake"),
        // falls das für die Tests ausreicht:
        // return new Kundennummer(1234L);
    }
}
