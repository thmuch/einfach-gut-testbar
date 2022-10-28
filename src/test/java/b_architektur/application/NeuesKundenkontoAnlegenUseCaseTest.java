package b_architektur.application;

import b_architektur.domain.model.Email;
import b_architektur.domain.service.ZaehlerRepository;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class NeuesKundenkontoAnlegenUseCaseTest {

    @Test
    void neuesKundenkontoAnlegen_erzeugt_Kunde_mit_Kundennummer() {

        // Given

        ZaehlerRepository zaehlerRepository = new FakeZaehlerRepository();
        FakeKundeRepository kundeRepository = new FakeKundeRepository();

        NeuesKundenkontoAnlegenUseCase useCase = new NeuesKundenkontoAnlegenUseCase(zaehlerRepository, kundeRepository);

        Email email = new Email("thomas.much@tk.de");

        // When

        useCase.neuesKundenkontoAnlegen(email);

        // Then

        assertThat(kundeRepository.getFakeDb()).containsKey(email);
    }
}