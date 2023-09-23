package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] rsl = new int[0];
        int i = 0;
        int j = array.length;
        while (i != j) {
            j--;
            if ((array[i] + array[j]) == target) {
                rsl = new int[2];
                rsl[0] = i;
                rsl[1] = j;
                break;
            }
            if (j - i == 1) {
                i++;
                j = array.length;
            }
        }
        return rsl;
    }
}
