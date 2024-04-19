package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int pizza = scanner.nextInt();
        int countPizza = 1;
        int p = pizza;
        while (p % people != 0) {
            p += pizza;
            countPizza++;
        }
        System.out.println(countPizza);
    }
}
