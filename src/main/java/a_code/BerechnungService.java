package a_code;

import java.time.LocalDate;

public class BerechnungService {

    public int ermittleWert() {

        LocalDate heute = LocalDate.now();

        int ergebnis = new Berechnung().ermittleWert(heute);

        return ergebnis;
    }
}
