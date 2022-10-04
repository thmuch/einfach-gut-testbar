package a_code;

import jakarta.inject.Inject;

import java.time.LocalDate;

public class BerechnungService {

    private final Berechnung berechnung;

    @Inject
    public BerechnungService(Berechnung berechnung) {
        this.berechnung = berechnung;
    }

    public int ermittleWert() {

        LocalDate heute = LocalDate.now();

        int ergebnis = berechnung.ermittleWert(heute);

        return ergebnis;
    }
}
