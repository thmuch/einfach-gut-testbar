package a_code;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class BerechnungServiceTest {

    @Test
    void ermittleWert_liefert_positiven_Wert() {

        // Given

        Berechnung berechnung = new Berechnung();
        BerechnungService berechnungService = new BerechnungService(berechnung);

        // When

        int wert = berechnungService.ermittleWert();

        // Then

        assertThat(wert).isGreaterThan(0);
    }

    /*
     * oder mit Mocking:
     */

    @Mock
    Berechnung berechnung;

    @Test
    void ermittleWert_ruft_Berechnung_auf() {

        // Given

        BerechnungService berechnungService = new BerechnungService(berechnung);

        given(berechnung.ermittleWert(any())).willReturn(0xcafebabe);

        // When

        int wert = berechnungService.ermittleWert();

        // Then

        assertThat(wert).isEqualTo(0xcafebabe);
        // oder
        verify(berechnung).ermittleWert(any());
    }
}