package test.java;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.Factorial;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FactorialTest {
    @Test
    public void testFactorial() {
        String input = "5\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Factorial.main(null);

        String esperado = "Introduce un número entero positivo: El factorial de 5 es 120\n";
        assertEquals(esperado, outContent.toString());
    }
}
