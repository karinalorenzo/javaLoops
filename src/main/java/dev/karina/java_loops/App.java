package dev.karina.java_loops;

import java.util.List;

import dev.karina.java_loops.MultiplicationTable.MultiplicationTable;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        int n = 5;
        List<String> table = MultiplicationTable.generateTable(n);
        for (String line : table){
            System.out.println(line);
        }
    }
}
