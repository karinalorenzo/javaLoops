package dev.karina.java_loops.MultiplicationTable;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {
    public static List<String> generateTable(int n){
        List<String> table = new ArrayList<>();
            for (int i = 1; i <= 10; i++){
                table.add(n + " x " + i + " = " + ((long)n * i));
            }
            return table;
    }
}