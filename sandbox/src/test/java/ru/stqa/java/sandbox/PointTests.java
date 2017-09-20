package ru.stqa.java.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by eSeemann on 19.09.2017.
 */
public class PointTests {

    @Test
    public void testDistance() {
        Point p1 = new Point(5, 10);
        Point p2 = new Point(10, 10);
        assert p1.distance(p2) == 5.0;
    }

    @Test
    public void testDistance2() {
        Point p1 = new Point(100, 100);
        Point p2 = new Point(100, 100);
        assert p1.distance(p2) == 0;
    }

    @Test
    public void testDistance3() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(50, 50);
        Assert.assertEquals(p1.distance(p2), 50);
    }
}
