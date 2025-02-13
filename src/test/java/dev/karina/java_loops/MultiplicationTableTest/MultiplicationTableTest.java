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

    @Test
    @DisplayName("Test the multiplication table of Integer.MAX_VALUE")
    @Tag("Multiplication")
    public void testMultiplicationTableMaxValue() {
        int n = Integer.MAX_VALUE;
        List<String> expected = List.of(
            "2147483647 x 1 = 2147483647", "2147483647 x 2 = 4294967294", 
            "2147483647 x 3 = 6442450941", "2147483647 x 4 = 8589934588", 
            "2147483647 x 5 = 10737418235", "2147483647 x 6 = 12884901882", 
            "2147483647 x 7 = 15032385529", "2147483647 x 8 = 17179869176", 
            "2147483647 x 9 = 19327352823", "2147483647 x 10 = 21474836470"
        );
        List<String> result = MultiplicationTable.generateTable(n);
        assertEquals(expected, result);
    }
}
