package test.java;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.InvertirNumero;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class InvertirNumeroTest {
    @Test
    public void testInvertirNumero() {
        String input = "12345\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        InvertirNumero.main(null);

        String esperado = "Introduce un número: El número invertido es: 54321\n";
        assertEquals(esperado, outContent.toString());
    }
}
