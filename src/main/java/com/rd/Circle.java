package com.rd;

public class Circle<T> {
    private T name;
    private T radius;
    private boolean filled;

    public Circle(T name, T radius, boolean filled) {
        this.name = name;
        this.radius = radius;
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "Daire ismi: " + name + "\n" + "İçi Dolu: " + filled + "\n" + " Çevresi: " + radius + "\n";
    }
}









