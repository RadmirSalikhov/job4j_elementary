package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        int x2minusx1 = x2 - x1;
        int y2minusy1 = y2 - y1;
        double first = Math.pow(x2minusx1, 2);
        double second = Math.pow(y2minusy1, 2);
        double root = first + second;
        return Math.sqrt(root);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) - > " + result);
    }
}
