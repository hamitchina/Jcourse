package com.company;

public class NumberHandler {

    public NumberHandler() {
    }

    //3) Написать метод, который будет отнимать от переданного числа единицу дo тех пор,
    // пока число не будет кратно 4 (сперва проверка, потом действие)

    public void printNumbersWhile(int numb1) {

        while (numb1 % 4 != 0) {
            System.out.println("i= " + numb1);
            numb1--;
        }
    }
    //4) Написать метод, который будет отнимать от переданного числа единицу до тех пор,
    // пока число не будет кратно 4 (сперва действие, потом проверка)

    public void printNumbersDo(int numb2) {

        do {
            System.out.println("i= " + numb2);
            numb2--;

        } while (numb2 % 4 != 0);
    }

    //5) Написать метод, который возвращает true, если среди 3 переданных чисел
    //   есть числа которые делятся на 3 и на 5 без остатка

    public boolean repetitionFactorChecker (int n1, int n2, int n3) {
        return (n1 % 5 == 0 && n1 % 3 == 0) || (n2 % 5 == 0 && n2 % 3 == 0) || (n3 % 5 == 0 && n3 % 3 == 0);
    }

    // or
    //проверка числа на кратность
    public boolean repChecker(int var){
        return var % 5 == 0 && var % 3 ==0;
    }
    //вызов метода в методе для проверки чисел из массива на кратность
    public boolean repCheckerArr(int [] var){
        boolean result = false;
        for (int i = 0; i < var.length; i++){
            if (repChecker(var[i])) result = true;
        }
        return result;
    }


//6) Написать метод, который будет складывать значение итеративной переменной с каждым шагом итерации и выведет результат в консоль

    public void increasing() {
        int inc = 0;
        for (int i = 0; i < 5; i++)
            inc += i;
        System.out.println(inc);
    }

//7) Написать метод, в котором итерация будет происхдить с отрицательным шагом
    public void decreasing() {
        int dec = 0;
        for (int i = 5; i > 0; i--)
            dec += i;
        System.out.println(dec);
    }
}
