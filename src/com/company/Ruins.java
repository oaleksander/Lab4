package com.company;

public class Ruins implements Material {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return description() + ", потерявшие первончальную форму";
    }

    @Override
    public String description() {
        return "Остатки разрушившейся от времени гигантской кирпичной стены";
    }
}
