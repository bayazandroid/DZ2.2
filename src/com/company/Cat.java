package com.company;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public void draw() {
        System.out.println("\uD83D\uDC08");
    }

    @Override
    public void callSound() {
        System.out.println(" Мяу ");
    }

    @Override
    public boolean print() {
        System.out.println("Информация об кошке с класса кота: \n У кошки имя " + getName() + "\nИздает звук" + " Мяу"
        + "\nКот выглядит вот так \uD83D\uDC08");
        return false;
    }
}
