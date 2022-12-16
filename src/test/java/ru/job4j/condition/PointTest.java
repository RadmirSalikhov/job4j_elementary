package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to02then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        double expected = 2.0;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        double expected = 2.0;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when63to45then2dot82() {
        Point a = new Point(6, 3);
        Point b = new Point(4, 5);
        double dist = a.distance(b);
        double expected = 2.82;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when89to33then7dot81() {
        Point a = new Point(8, 9);
        Point b = new Point(3, 3);
        double dist = a.distance(b);
        double expected = 7.81;
        Assert.assertEquals(expected, dist, 0.01);
    }
}