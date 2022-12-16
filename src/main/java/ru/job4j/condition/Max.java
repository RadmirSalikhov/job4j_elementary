package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, max(third, fourth)));
    }

    public static void main(String[] args) {
        int result = Max.max(3, 6, 8, 19);
        System.out.println(result);
    }
}
