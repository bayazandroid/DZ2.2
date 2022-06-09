package com.company;

import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Circle circle = new Circle("Круг", 14);
        Triangle triangle = new Triangle("Треугольник", 11, 12, 13);
        Square square = new Square("Квадрат", 12);
        Rectangle rectangle = new Rectangle("Прямоуголььник", 10, 20);
        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Marusya");

        //Figure[] figures = {circle, triangle, square, rectangle}; //полиморфизм
        Drawable[] figures = {circle, triangle, square, rectangle, dog, cat};

        for (Drawable perFigure : figures) {
            if (perFigure instanceof Figure) {
                System.out.println(((Figure) perFigure).getName() + " Периметр -> " + ((Figure) perFigure).calculatePerimeter());
            }
            if (perFigure instanceof Animal) {
                System.out.println(((Animal) perFigure).getName());
                ((Animal) perFigure).callSound();
                ((Animal) perFigure).print();
            }
            perFigure.draw();
        }

        System.out.println();
        Animal object1A = createObject();
        System.out.println("________");
        Animal object1B = createObject();
        System.out.println("________");
        Animal object1C = createObject();
        System.out.println("________");
        System.out.println(object1A.print());
        System.out.println(object1B.print());
        System.out.println(object1C.print());
    }

    public static Animal createObject() {
        Scanner enterName, enterNumber;
        String name;
        Dog dog_1;
        Cat cat_1;
        enterName = new Scanner(System.in);
        enterNumber = new Scanner(System.in);
        System.out.println("Выбери число от 1 до 3. \nЧисло 1 создать собаку. \nЧисло 2 создать кота.");
        int number = enterNumber.nextInt();
        switch (number) {
            case 1:
                System.out.println("Введите имя собаки");
                name = enterName.next();
                dog_1 = new Dog(name);
                dog_1.print();
                return dog_1;
            case 2:
                System.out.println("Введите имя кошки");
                name = enterName.next();
                cat_1 = new Cat(name);
                cat_1.print();
                return cat_1;
        }
        return createObject();
    }
}