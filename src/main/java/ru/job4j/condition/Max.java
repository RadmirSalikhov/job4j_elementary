package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        int max = first > second ? first : second;
        return max;
    }

    public static void main(String[] args) {
        int result = Max.max(3, 6);
        System.out.println(result);
    }
}
