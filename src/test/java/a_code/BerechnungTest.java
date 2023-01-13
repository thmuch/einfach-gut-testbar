package a_code;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class BerechnungTest {

    @Test
    void ermittleWert_liefert_Standardwert_vor_Stichtag() {

        // Given

        Berechnung berechnung = new Berechnung();

        LocalDate heute = LocalDate.of(2023, Month.JANUARY, 12);

        // When

        int wert = berechnung.ermittleWert(heute);

        // Then

        assertThat(wert).isEqualTo(123);
    }

    @Test
    void ermittleWert_liefert_höheren_Wert_ab_Stichtag() {

        // Given

        Berechnung berechnung = new Berechnung();

        LocalDate heute = LocalDate.of(2024, Month.JANUARY, 1);

        // When

        int wert = berechnung.ermittleWert(heute);

        // Then

        assertThat(wert).isEqualTo(456);
    }
}