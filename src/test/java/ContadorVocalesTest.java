package test.java;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.ContadorVocales;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ContadorVocalesTest {
    @Test
    public void testContadorVocales() {
        String input = "Hola\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ContadorVocales.main(null);

        String esperado = "Introduce una palabra: La palabra tiene 2 vocales.\n";
        assertEquals(esperado, outContent.toString());
    }
}
