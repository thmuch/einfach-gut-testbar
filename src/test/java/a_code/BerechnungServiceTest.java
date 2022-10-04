package a_code;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class BerechnungServiceTest {

    @Test
    void ermittleWert_liefert_Standardwert_vor_Stichtag() {

        // Given

        BerechnungService berechnungService = new BerechnungService();

        // When

        int wert = berechnungService.ermittleWert();

        // Then

        // FIXME: ab 01.01.2023 wird dieser Test fehlschlagen...
        assertThat(wert).isEqualTo(123);
    }

    @Test
    void ermittleWert_liefert_höheren_Wert_ab_Stichtag() {

        // Given

        BerechnungService berechnungService = new BerechnungService();

        // When

        // FIXME: wie simulieren wir das künftige Datum?
        int wert = berechnungService.ermittleWert();

        // Then

        assertThat(wert).isEqualTo(456);
    }
}