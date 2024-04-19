package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        String hello="Hello, ";
        int amountPeople = scanner.nextInt();
        if (amountPeople == 0) {
            System.out.println("Oh, it looks like there is no one here");
        }
        if (amountPeople > 0) {
            String[] people = new String[amountPeople];
            for (int i = 0; i < people.length; i++) {
                people[i] =scanner1.nextLine();
            }
            for (int j = 0; j < people.length; j++) {
                System.out.println(hello+people[j]);
            }
        }
        if (amountPeople < 0) {
            System.out.println("Seriously? Why so negative?");
        }
    }
}