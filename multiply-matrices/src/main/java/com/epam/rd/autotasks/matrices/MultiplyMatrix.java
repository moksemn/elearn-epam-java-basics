package com.epam.rd.autotasks.matrices;

import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            throw new IllegalArgumentException("Number of columns in the first matrix should be the same as the number of rows in the second matrix");
        } else {
            int rowsFirstMatrix = matrix1.length;
            int columnsSecondMatrix = matrix2[0].length;
            int rowsSecondMatrix = matrix2.length;
            int[][] multiplyMatrix = new int[rowsFirstMatrix][columnsSecondMatrix];
            for (int i = 0; i < rowsFirstMatrix; i++) {
                for (int j = 0; j < columnsSecondMatrix; j++) {
                    int sum = 0;
                    for (int k = 0; k < rowsSecondMatrix; k++) {
                        sum += matrix1[i][k] * matrix2[k][j];
                    }
                    multiplyMatrix[i][j] = sum;
                }
            }
            return multiplyMatrix;
        }
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567}};

        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6}};

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
