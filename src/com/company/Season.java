package com.company;

//2) Написать метод, который выводит различные строковые в зависимости от значения
// переданного объекта Enum типа (необходимо в первую очередь создать Enum)

public enum Season {
    Summer, Autumn, Winter, Spring;

    public static void printSeason (Season season) {
        switch (season) {
            case Summer:
                System.out.println("Летом теплая погода");
                break;
            case Autumn:
                System.out.println("Осенью птицы улетают на юг");
                break;
            case Winter:
                System.out.println("Обожаю снег");
                break;
            case Spring:
                System.out.println("Весной цветет сирень");
                break;
        }
    }
}

