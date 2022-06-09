package com.company;

public class Rectangle extends Figure{
    private int sideA;
    private int sideB;

    public Rectangle(String name, int sideA, int sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public int calculatePerimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDD32");
    }
}
