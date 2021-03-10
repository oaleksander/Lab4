package com.company;

public abstract class Human {

    private final String name;

    Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final String toString() {
        return "Человек по имени " + name;
    }

    public enum Mood {
        HAPPY("Весело"),
        SAD("Грустно"),
        SLEEPING("Сонный");

        public final String label;

        Mood(String label) {
            this.label = label;
        }
    }
}
