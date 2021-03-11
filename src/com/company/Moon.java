package com.company;

import java.util.Objects;

public class Moon {

    final StoneObject ground;

    final String description;

    public Moon(StoneObject ground, String description) {
        this.ground = ground;
        this.description = description;
    }

    public int compareTo(Object o) {
        if (o.equals(this)) return 0;
        if (o instanceof Pancake)
            throw new FunnyComparisonException("Cмешно сравнивать " + this.toString() + " c " + o.toString());
        return this.hashCode() - o.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Moon)) return false;
        Moon moon = (Moon) o;
        return description.equals(moon.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public String toString() {
        return "Луна - " + getDescription();
    }

    public StoneObject getGround() {
        return ground;
    }

    public String getDescription() {
        return description;
    }

    private class FunnyComparisonException extends IllegalArgumentException {
        public FunnyComparisonException(String message) {
            super(message);
        }
    }
}
