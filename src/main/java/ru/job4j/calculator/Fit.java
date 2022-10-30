package ru.job4j.calculator;

import java.util.Scanner;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How tall are you:");
        short height = Short.parseShort(sc.nextLine());
        double man = Fit.manWeight(height);
        System.out.println("Man " + height + " is " + man);
        double woman = Fit.womanWeight(height);
        System.out.println("Woman " + height + " is " + woman);
    }

}
