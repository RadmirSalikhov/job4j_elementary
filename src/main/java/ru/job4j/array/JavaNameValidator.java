package ru.job4j.array;

//тобы проверить является ли символ числом, мы будем использовать метод isDigit() класса Character

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (!isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code)) {
                valid = false;

                break;
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
        //символ доллара (36) и нижнее подчеркивание (95)
        //метод должен вернуть true, если символ является символом доллара и нижнее подчеркивание

    }

    public static boolean isUpperLatinLetter(int code) {
        //прописные латинские символы (от 65 до 90 включая обе границы)
        //метод должен вернуть true, если символ является прописным латинским символом
        return code < 65 || code > 90;


    }

    public static boolean isLowerLatinLetter(int code) {
        //строчные латинские символы (от 97 до 122 включая обе границы)
        //метод должен вернуть true, если символ является строчным латинским символом
        return code < 97 || code > 122;
    }
}
