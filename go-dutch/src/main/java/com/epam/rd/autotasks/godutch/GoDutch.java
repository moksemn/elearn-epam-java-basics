package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int amountFriends = scanner.nextInt();
        if (price < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else {
            if (price == 0) {
                System.out.println(0);
            } else {
                if (amountFriends <= 0) {
                    System.out.println("Number of friends cannot be negative or zero");
                } else {
                    if (amountFriends > price) {
                        System.out.println(1);
                    } else {
                        int dividePrice = price / amountFriends;
                        int tea = dividePrice / 10;
                        int sum = dividePrice + tea;
                        System.out.println(sum);
                    }
                }
            }
        }
    }
}
