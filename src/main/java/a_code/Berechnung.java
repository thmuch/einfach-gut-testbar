package a_code;

import java.time.LocalDate;
import java.time.Month;

public class Berechnung {

    private static final LocalDate STICHTAG = LocalDate.of(2024, Month.JANUARY, 1);

    public int ermittleWert(LocalDate heute) {

        if (heute.isBefore(STICHTAG)) {
            return 123;
        } else {
            return 456;
        }
    }
}
