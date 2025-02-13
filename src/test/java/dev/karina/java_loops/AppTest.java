package dev.karina.java_loops;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AppTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("Test App output for multiplication table of 5")
    @Tag("App")
    public void testAppOutput() {
        App.main(new String[]{});

        String expectedOutput = 
            "5 x 1 = 5\n" +
            "5 x 2 = 10\n" +
            "5 x 3 = 15\n" +
            "5 x 4 = 20\n" +
            "5 x 5 = 25\n" +
            "5 x 6 = 30\n" +
            "5 x 7 = 35\n" +
            "5 x 8 = 40\n" +
            "5 x 9 = 45\n" +
            "5 x 10 = 50\n";

        assertEquals(expectedOutput, outContent.toString());

        // Usando Hamcrest para verificar que la salida contiene las cadenas esperadas
        assertThat(outContent.toString(), containsString("5 x 1 = 5"));
        assertThat(outContent.toString(), containsString("5 x 2 = 10"));
        assertThat(outContent.toString(), containsString("5 x 3 = 15"));
        assertThat(outContent.toString(), containsString("5 x 4 = 20"));
        assertThat(outContent.toString(), containsString("5 x 5 = 25"));
        assertThat(outContent.toString(), containsString("5 x 6 = 30"));
        assertThat(outContent.toString(), containsString("5 x 7 = 35"));
        assertThat(outContent.toString(), containsString("5 x 8 = 40"));
        assertThat(outContent.toString(), containsString("5 x 9 = 45"));
        assertThat(outContent.toString(), containsString("5 x 10 = 50"));
    }
}
