package test;

import JavaPriklady4.ZakladneMatematickeOperacieCezMetody;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Trieda na testovanie základných matematických operácií")
class TestujZakladneMatematickeOperacieCezMetody {
    @Test
    @DisplayName("Testovanie sčítania")
    public void otestujScitanie() {
        assertEquals(10, ZakladneMatematickeOperacieCezMetody.scitaj(5, 5));
        assertEquals(8.5, ZakladneMatematickeOperacieCezMetody.scitaj(2.75, 5.75));
    }


    @Test

    @DisplayName("Testovanie modulo")

    public void otestujModulo() {
        assertEquals(0, ZakladneMatematickeOperacieCezMetody.modulo(10, 5));
        assertEquals(1, ZakladneMatematickeOperacieCezMetody.modulo(11, 5));
    }

}