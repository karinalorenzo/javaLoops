package dev.karina.java_loops;

import dev.karina.java_loops.MultiplicationTable.MultiplicationTable;
import java.util.List;

public class App {
    public static void main(String[] args) {
        int n = 5; // Puedes cambiar este valor para probar diferentes tablas de multiplicar
        List<String> table = MultiplicationTable.generateTable(n);
        for (String line : table) {
            System.out.println(line);
        }
    }
}

