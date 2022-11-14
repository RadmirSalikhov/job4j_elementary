package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String dayweek;
        switch (day) {
            case 1:
                dayweek = "Понедельник";
                break;
            case 2:
                dayweek = "Вторник";
                break;
            case 3:
                dayweek = "Среда";
                break;
            case 4:
                dayweek = "Четверг";
                break;
            case 5:
                dayweek = "Пятница";
                break;
            case 6:
                dayweek = "Суббота";
                break;
            case 7:
                dayweek = "Воскресенье";
                break;
            default:
                dayweek = "Ошибка";
                break;
        }
        return dayweek;
    }
}
