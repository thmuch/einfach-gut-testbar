package a_code;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class BerechnungServiceTest {

    @Test
    void ermittleWert_liefert_gültigen_Wert() {

        // Given

        BerechnungService berechnungService = new BerechnungService();

        // When

        int wert = berechnungService.ermittleWert();

        // Then

        assertThat(wert).isGreaterThan(0);
    }
}