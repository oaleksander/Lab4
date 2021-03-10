package com.company;

import java.util.Objects;

public class Mountain implements StoneObject {

    final Material material;

    public Mountain(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    @Override
    public Material material() {
        return material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mountain)) return false;
        Mountain that = (Mountain) o;
        return Objects.equals(getMaterial(), that.getMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaterial());
    }

    @Override
    public String toString() {
        return "Гора из " + material.description();
    }
}
