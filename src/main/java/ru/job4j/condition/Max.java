package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static void main(String[] args) {
        int result = Max.max(3, 6);
        System.out.println(result);
    }
}
