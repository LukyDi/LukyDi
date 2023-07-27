package test;

import JavaPriklady4.PriradenieZnamky;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HodnotTest {

    @Test
    @DisplayName("Test metody Hodnot")
    public void hodnotTest() {
        assertEquals("A", PriradenieZnamky.hodnot(95));
        assertEquals("B", PriradenieZnamky.hodnot(85));
        assertEquals("C", PriradenieZnamky.hodnot(65));
        assertEquals("Neuspel", PriradenieZnamky.hodnot(55));

    }
}

