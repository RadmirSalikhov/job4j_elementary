package ru.job4j.condition;

import java.util.Scanner;

import static java.lang.Short.parseShort;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {

        return num > 0;
    }

    public static boolean notEven(int num) {

        return num % 2 != 0;
    }

    public static boolean notPositive(int num) {

        return num < 0;
    }

    public static boolean notEvenAndPositive(int num) {

        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {

        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = parseShort(sc.nextLine());
        boolean isEven = LogicNot.isEven(num);
        System.out.println(num + " четное? " + isEven);
        boolean isPositive = LogicNot.isPositive(num);
        System.out.println(num + " > 0 ? " + isPositive);
        boolean notEven = LogicNot.notEven(num);
        System.out.println(num + " нечетное? " + notEven);
        boolean notPositive = LogicNot.notPositive(num);
        System.out.println(num + " <0 ?" + notPositive);
        boolean notEvenAndPositive = LogicNot.notEvenAndPositive(num);
        System.out.println(num + " нечетное и >0 ?" + notEvenAndPositive);
        boolean evenOrNotPositive = LogicNot.evenOrNotPositive(num);
        System.out.println(num + " четное и <0 ? " + evenOrNotPositive);
    }
}
