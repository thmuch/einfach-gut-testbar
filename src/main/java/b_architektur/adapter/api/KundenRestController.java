package b_architektur.adapter.api;

import b_architektur.application.NeuesKundenkontoAnlegenUseCase;
import b_architektur.domain.model.Email;
import jakarta.inject.Inject;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/kunden")
public class KundenRestController {

    private final NeuesKundenkontoAnlegenUseCase useCase;

    @Inject
    public KundenRestController(NeuesKundenkontoAnlegenUseCase useCase) {
        this.useCase = useCase;
    }

    @PUT
    @Path("/{email}")
    public void kundeNeuAnlegen(@PathParam("email") String emailAdresse) {

        Email email = new Email(emailAdresse);

        useCase.neuesKundenkontoAnlegen(email);
    }
}
