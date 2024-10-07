package test.java;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.SumaPositivos;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SumaPositivosTest {
    @Test
    public void testSumaPositivos() {
        String input = "5\n10\n-1\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        SumaPositivos.main(null);

        String esperado = "Introduce un número: Introduce un número: Introduce un número: La suma de los números positivos es: 15\n";
        assertEquals(esperado, outContent.toString());
    }
}
