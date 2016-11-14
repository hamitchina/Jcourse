package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1е задание
        int num;
        System.out.print("Введите число: ");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        if (num % 2 == 0)
            System.out.print("четное");
        else
            System.out.print("нечетное");
    }
}
