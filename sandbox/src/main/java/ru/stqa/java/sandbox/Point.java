package ru.stqa.java.sandbox;

/**
 * Created by eSeemann on 18.09.2017.
 */
public class Point {
    public double x;
    public double y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p2) {
        return Math.sqrt((x - p2.x) * (x - p2.x) + (y - p2.y) * (y - p2.y));
    }


    public static void main(String[] args) {

        Point p1 = new Point(5, 10);
        Point p2 = new Point(10, 10);

        System.out.println("Расстояние между точкой p1 и p2 = " + p1.distance(p2));
    }

}

