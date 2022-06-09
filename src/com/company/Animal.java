package com.company;

public abstract class Animal implements Drawable, Printable, SoundProducible {
    private final String name;
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
