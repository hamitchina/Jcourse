package com.company;

public class NumberHandler {

    public NumberHandler () {}

    //3) Написать метод, который будет отнимать от переданного числа единицу дo тех пор,
    // пока число не будет кратно 4 (сперва проверка, потом действие)

    public void printNumbersWhile (int numb1) {

        while (numb1 % 4 != 0) {
            System.out.println("i= " + numb1);
            numb1 --;
        }
    }
    //4) Написать метод, который будет отнимать от переданного числа единицу до тех пор,
    // пока число не будет кратно 4 (сперва действие, потом проверка)

    public void printNumbersDo (int numb2){

        do {
            System.out.println("i= " + numb2);
            numb2 --;

        }while (numb2 % 4 != 0);
    }
}
