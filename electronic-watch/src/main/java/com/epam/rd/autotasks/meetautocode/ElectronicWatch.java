package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hour=0;
        int min=0;
        int counter=0;
        int sec=0;
        for (int i = 0; i < seconds; i++) {
            counter++;
            if (counter==60){
                min++;
                counter=0;
            }
            if (min==60){
                hour++;
                min=0;
            }
            if (hour>23){
                hour=0;
                min=0;
                sec=0;
            }
            sec=counter;
        }
        String h=Integer.toString(hour);
        String m=Integer.toString(min);
        String s=Integer.toString(sec);
        if(min<10){
            m="0"+m;
        }
        if (sec<10){
            s="0"+s;
        }
        System.out.println(h+":"+m+":"+s);
    }
}