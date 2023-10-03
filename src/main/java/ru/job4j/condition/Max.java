package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int middle, int right) {
        return max(left, max(middle, right));
    }

    public static int max(int left, int middleLeft, int middleRight, int right) {
        return max(left, max(middleLeft, middleRight, right));
    }

}
