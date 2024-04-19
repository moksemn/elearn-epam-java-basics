package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strings = string.split(" ");
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].equals("0")) {
                counter++;
            }
            if (strings[i].equals("0")) {
                break;
            }
        }
        for (int i=0;i<counter;i++){
            sum+=Integer.parseInt(strings[i]);
        }
        System.out.println(sum/counter);
    }

}