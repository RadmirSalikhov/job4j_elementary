package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        for (int y = 0; y < post.length; y++) {
            if (post[post.length - y - 1] != word[word.length - y - 1]) {
                return false;
            }
        }
        return true;
    }
}
