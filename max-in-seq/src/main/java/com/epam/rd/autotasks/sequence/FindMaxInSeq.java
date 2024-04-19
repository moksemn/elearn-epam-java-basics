package com.epam.rd.autotasks.sequence;


import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        int counter = 0;
        String[] massNumbers = numbers.split(" ");
        for (int i = 0; i < massNumbers.length; i++) {
            if (!massNumbers[i].equals("0")) {
                counter++;
            }
            if (massNumbers[i].equals("0")) {
                break;
            }
        }
        int[] sortedMass = new int[counter];
        for (int i = 0; i < sortedMass.length; i++) {
            sortedMass[i] = Integer.parseInt(massNumbers[i]);
        }

        int maxNumber=sortedMass[0];
        for (int i = 0; i < sortedMass.length; i++) {
            for (int j = 1; j < sortedMass.length; j++) {
                if (maxNumber<sortedMass[j]){
                    maxNumber=sortedMass[j];
                }
            }
        }
        return maxNumber;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
