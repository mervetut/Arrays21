package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int s = 0;
        int[] num = new int[] {3, 5,0, 11, 1} ;
        for (int i = 0; i <= 4; i++) {
            if (num[i] == 0)
                s = s + num[i];
                count = count + 1;
                if (count == 0)
                System.out.println(0);
                else
                    System.out.println(s / count);

    }
}}