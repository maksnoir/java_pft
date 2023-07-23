package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        System.out.println("1-3 Расстояние между двумя точками " + p1 + " и " + p2 + " = " + distance(p1, p2));
        System.out.println("4 Расстояние между двумя точками " + p1.distanceTo(p2));
    }

    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
}
