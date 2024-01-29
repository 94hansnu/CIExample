package org.example;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testMainMethod() {
        // Fånga System.out.println()
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Kör main-metoden
        Main.main(new String[]{});

        // Förväntat utskrift
        String expectedOutput = "Hello and welcome!";
        assertEquals(expectedOutput, outContent.toString().trim());

        // Återställ System.out.println() till standardutgång
        System.setOut(System.out);
    }

}
