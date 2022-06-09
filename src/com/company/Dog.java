package com.company;

public class Dog extends Animal{
        public Dog(String name){
            super(name);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC08");
    }

    @Override
    public boolean print() {
        System.out.println("Информация об собаке с класса кота: \n У собаки имя " + getName() + "\nИздает звук " + "гав-гав"
                + "\nСобака выглядит вот так \uD83D\uDC08");
        return false;
    }

    @Override
    public void callSound() {
        System.out.println(" Гав-гав");
    }
}
