package pl.javastart.task;

import java.util.Scanner;

public class Array2DController {
    private final int maxColAmount = 100;
    private final int maxRowAmount = 100;

    private int[][] array;

    public Array2DController() {
        Scanner scanner = new Scanner(System.in);
        int rowAmount = getRowAmount(scanner);
        int colAmount = getColumnAmount(scanner);
        array = new int[rowAmount][colAmount];
        fillArray();
        scanner.close();
    }

    private int getColumnAmount(Scanner scanner) {
        int colAmount = maxColAmount + 1;
        while (colAmount > maxColAmount) {
            System.out.printf("Podaj liczbę kolumn mniejszą lub równą %d:\n", maxColAmount);
            colAmount = scanner.nextInt();
        }
        return colAmount;
    }

    private int getRowAmount(Scanner scanner) {
        int rowAmount = maxRowAmount + 1;
        while (rowAmount > maxRowAmount) {
            System.out.printf("Podaj liczbę wierszy mniejszą lub równą %d:\n", maxRowAmount);
            rowAmount = scanner.nextInt();
        }
        return rowAmount;
    }

    private void fillArray() {
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                array[i][j] = i*j;
            }
        }
    }

    public void showArray() {
        String rowsSeparator = "-------";
        for (int i=0; i<array[0].length; i++) {
            for (int j=0; j<array.length; j++) {
                System.out.printf("%5d |", array[j][i]);
            }
            System.out.println();
            System.out.println(rowsSeparator.repeat(array.length));
        }
    }

    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }
}
