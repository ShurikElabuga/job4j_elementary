package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp5 = array[0];
        int temp4 = array[4];
        int temp3 = array[1];
        array[0] = array[3];
        array[1] = array[2];
        array[2] = temp3;
        array[3] = temp4;
        array[4] = temp5;

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
