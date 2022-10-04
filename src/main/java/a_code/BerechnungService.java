package a_code;

import java.time.LocalDate;
import java.time.Month;

public class BerechnungService {

    private static final LocalDate STICHTAG = LocalDate.of(2023, Month.JANUARY, 1);

    public int ermittleWert() {

        LocalDate heute = LocalDate.now();

        if (heute.isBefore(STICHTAG)) {
            return 123;
        } else {
            return 456;
        }
    }
}
