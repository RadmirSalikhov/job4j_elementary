package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To6To8Then8() {
        int first = 3;
        int second = 6;
        int third = 8;
        int result = Max.max(first, second, third);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To16To8To9Then16() {
        int first = 3;
        int second = 16;
        int third = 8;
        int fourth = 9;
        int result = Max.max(first, second, third, fourth);
        int expected = 16;
        assertThat(result).isEqualTo(expected);
    }
}
