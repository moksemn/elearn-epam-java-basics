package com.epam.rd.autotasks;

import java.util.Arrays;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] array = new int[rows][columns];
        int value = 1;
        int row = 0;
        int col = 0;
        int lastRow = rows - 1;
        int lastCol = columns - 1;

        while (value <= rows * columns) {
            // вправо
            for (int i = col; i <= lastCol; i++) {
                array[row][i] = value++;
            }
            // вниз
            for (int i = row + 1; i <= lastRow; i++) {
                array[i][lastCol] = value++;
            }
            // влево, только если высота больше 1
            if (row < lastRow) {
                for (int i = lastCol - 1; i >= col; i--) {
                    array[lastRow][i] = value++;
                }
            }
            // вверх, только если ширина больше 1
            if (col < lastCol) {
                for (int i = lastRow - 1; i > row; i--) {
                    array[i][col] = value++;
                }
            }
            row++;
            col++;
            lastRow--;
            lastCol--;
        }

        return array;
    }


    public static void main(String[] args) {

        int[][] spiral = Spiral.spiral(5, 6);

        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(String.format("%4s", spiral[i][j]));
            }
            System.out.println();
        }
    }
}