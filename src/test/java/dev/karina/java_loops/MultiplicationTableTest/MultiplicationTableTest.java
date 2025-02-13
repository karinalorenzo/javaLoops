package dev.karina.java_loops.MultiplicationTableTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import dev.karina.java_loops.MultiplicationTable.MultiplicationTable;


public class MultiplicationTableTest{

    @Test
    @DisplayName("Test the multiplication table of 5")
    @Tag("Multiplication")
    public void testMultiplicationTable() {
        int n = 5;
        List<String> expected = List.of(
                "5 x 1 = 5", "5 x 2 = 10", "5 x 3 = 15",
                "5 x 4 = 20", "5 x 5 = 25", "5 x 6 = 30",
                "5 x 7 = 35", "5 x 8 = 40", "5 x 9 = 45",
                "5 x 10 = 50");
        List<String> result = MultiplicationTable.generateTable(n);
        assertEquals(expected, result);

        assertThat(result, contains(
                "5 x 1 = 5", "5 x 2 = 10", "5 x 3 = 15",
                "5 x 4 = 20", "5 x 5 = 25", "5 x 6 = 30",
                "5 x 7 = 35", "5 x 8 = 40", "5 x 9 = 45",
                "5 x 10 = 50"));
    }

    @Test
    @DisplayName("Test the multiplication table of -5")
    @Tag("Multiplication")
    public void testMultiplicationTableNegative() {
        int n = -5;
        List<String> expected = List.of(
            "-5 x 1 = -5", "-5 x 2 = -10", "-5 x 3 = -15",
            "-5 x 4 = -20", "-5 x 5 = -25", "-5 x 6 = -30",
            "-5 x 7 = -35", "-5 x 8 = -40", "-5 x 9 = -45",
            "-5 x 10 = -50"
        );
        List<String> result = MultiplicationTable.generateTable(n);
        assertEquals(expected, result);
    }
}
