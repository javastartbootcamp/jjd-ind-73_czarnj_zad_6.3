package pl.javastart.task;

import java.util.Scanner;

public class Array2dController {
    private final int maxColAmount = 100;
    private final int maxRowAmount = 100;

    private final Scanner scanner = new Scanner(System.in);

    public int[][] createArray() {
        int rowAmount = getRowAmount();
        int columnAmount = getColumnAmount();
        int[][] newArray = new int[rowAmount][columnAmount];

        for (int i = 0; i < rowAmount; i++) {
            for (int j = 0; j < columnAmount; j++) {
                newArray[i][j] = i * j;
            }
        }
        return newArray;
    }

    private int getColumnAmount() {
        int colAmount = maxColAmount + 1;
        while (colAmount > maxColAmount) {
            System.out.printf("Podaj liczbę kolumn mniejszą lub równą %d:\n", maxColAmount);
            colAmount = scanner.nextInt();
        }
        return colAmount;
    }

    private int getRowAmount() {
        int rowAmount = maxRowAmount + 1;
        while (rowAmount > maxRowAmount) {
            System.out.printf("Podaj liczbę wierszy mniejszą lub równą %d:\n", maxRowAmount);
            rowAmount = scanner.nextInt();
        }
        return rowAmount;
    }

    public void showFormattedArray(int[][] array) {
        String rowsSeparator = "-------";
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%5d |", array[j][i]);
            }
            System.out.println();
            System.out.println(rowsSeparator.repeat(array.length));
        }
    }
}
