package b_architektur.architecture;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;
import static com.tngtech.archunit.library.Architectures.onionArchitecture;

@AnalyzeClasses(packages = "b_architektur")
public class OnionArchitekturTest {

    @ArchTest
    void Onion_Architektur_wird_beachtet(JavaClasses analyzedClasses) {

        ArchRule rule = onionArchitecture()
                .domainModels("..domain.model..")
                .domainServices("..domain.service..")
                .applicationServices("..application..")
                .adapter("REST-API", "..adapter.api..")
                .adapter("Oracle-DB", "..adapter.datenbank..")
                .adapter("SAP-Nummernkreis", "..adapter.zaehler..");

        rule.check(analyzedClasses);
    }

    @ArchTest
    void keine_Framework_Abhängigkeiten_im_Domänencode(JavaClasses analyzedClasses) {

        ArchRule rule = noClasses()
                .that().resideInAPackage("..domain..")
                .should().dependOnClassesThat().resideInAnyPackage("javax..", "jakarta..", "org.springframework..")
                .because("our domain core should be independent of frameworks");

        rule.check(analyzedClasses);
    }
}
