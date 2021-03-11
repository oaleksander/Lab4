package com.company;

import java.util.Objects;

public class Pancake {
    final String description;

    public Pancake(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pancake)) return false;
        Pancake pancake = (Pancake) o;
        return Objects.equals(description, pancake.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public String toString() {
        return "Блин - " + getDescription();
    }

    public String getDescription() {
        return description;
    }
}
