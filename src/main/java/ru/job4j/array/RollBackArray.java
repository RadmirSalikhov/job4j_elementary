package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            int lastIndex = array[index];
            int currentIndex = array.length - index - 1;
            result[currentIndex] = lastIndex;
        }
        return result;
    }
}
