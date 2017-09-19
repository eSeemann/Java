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

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }


    public static void main(String[] args) {

        Point p1 = new Point(5, 10);
        Point p2 = new Point(10, 10);

        System.out.println("Расстояние между точкой p1 и p2 = " + distance(p1, p2));
    }

}

