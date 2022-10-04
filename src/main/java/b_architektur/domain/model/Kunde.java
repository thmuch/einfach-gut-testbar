package b_architektur.domain.model;

public class Kunde {

    private Kundennummer kundennummer;
    private Email email;

    public Kunde(Kundennummer kundennummer, Email email) {
        this.kundennummer = kundennummer;
        this.email = email;
    }

    public Kundennummer getKundennummer() {
        return kundennummer;
    }

    public Email getEmail() {
        return email;
    }
}
