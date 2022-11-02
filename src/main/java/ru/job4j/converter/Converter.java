package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float ine = 140;
        float expectede = 2;
        float oute = Converter.rubleToEuro(ine);
        boolean passede = expectede == oute;
        System.out.println("140 rubles are 2. Test result : " + passede);

        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
        float ind = 140;
        float expectedd = (float) 2.3333333;
        float outd = Converter.rubleToDollar(ind);
        boolean passedd = expectedd == outd;
        System.out.println("140 rubles are 2. Test result : " + passedd);
    }
}
