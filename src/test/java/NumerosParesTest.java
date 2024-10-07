package test.java;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.NumerosPares;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class NumerosParesTest {
    @Test
    public void testNumerosPares() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        NumerosPares.main(null);

        String esperado = "2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100 ";
        assertEquals(esperado, outContent.toString());
    }
}
