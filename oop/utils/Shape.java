package oop.utils;

public class Shape {
    String type;
    String color;
    String instrumentType;
    int x, y = 0;
    int width, height;
    float thickness;

    protected Shape() {
        // You cannot create new Shape() because this is package protected. Only
        // inheritance allows you to do the change
    }
    
}
