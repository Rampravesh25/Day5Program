package com.bridgelabz;

import java.util.Scanner;

public class LargeNum {
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print("Largest number is : ");
        System.out.print((a>b)?(a>c)?a:c:(b>c)?b:c);
    }
}
