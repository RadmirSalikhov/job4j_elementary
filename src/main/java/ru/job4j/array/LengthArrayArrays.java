package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{5}, {6, 9}, {7, 8, 9}, {9, 3, 5, 3}};
        for (int[] number : numbers) {
            System.out.println("Размер вложенного массива равен: " + number.length);
        }
    }
}
