package ru.job4j.calculator;

public class Fit {
    private static int man = 100;
    private static int woman = 110;

    public static void checkHeight(short height) {
        if (height < 150 || height > 220) {
            System.out.println("Проверьте корректнойсть роста человека");
        }
    }

    public static double manWeight(short height) {
        checkHeight(height);
        double calculateWtight = (height - man) * 1.15;
        return calculateWtight;
    }


    public static double womanWeight(short height) {
        checkHeight(height);
        double calculateWtight = (height - woman) * 1.15;
        return calculateWtight;
    }


    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        double woman = womanWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
}
