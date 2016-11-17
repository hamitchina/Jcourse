package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       // 1) Написать метод, который выводит сообщение "Четное", если передаваемое число четное
       // и "Нечетное", если передаваемое число нечетное.
        int num;
        System.out.print("Введите число: ");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        if (num % 2 == 0)
            System.out.println("четное");
        else
            System.out.println("нечетное");


        Season.printSeason(Season.Autumn);


        NumberHandler handler1 = new NumberHandler();

        handler1.printNumbersWhile(19);
        handler1.printNumbersDo(19);

        handler1.increasing();
        handler1.decreasing();







    }











}
