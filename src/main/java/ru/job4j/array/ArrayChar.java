package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < word.length; i++) {
            for (int y = 0; y < pref.length; y++) {
                if (pref[y] != word[y]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
