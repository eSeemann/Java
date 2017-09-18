package ru.stqa.java.sandbox;

import org.testng.annotations.Test;

/**
 * Created by eSeemann on 19.09.2017.
 */
public class SquareTests {

    @Test
    public void testArea() {
        Square s = new Square(5);
        assert s.area() == 25;

    }
}
