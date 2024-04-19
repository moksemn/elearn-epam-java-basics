package com.epam.rd.autotasks.matrices;

import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
      int rows=matrix.length;
      int columns=matrix[0].length;
      int[][] transposeMatrix=new int[columns][rows];
      for (int i=0;i<transposeMatrix.length;i++){
          for (int j=0;j<transposeMatrix[0].length;j++){
              transposeMatrix[i][j]=matrix[j][i];
          }
      }
      return transposeMatrix;
    }


    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] matrix = {
                {1, 2},
                {7, -13}};

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
