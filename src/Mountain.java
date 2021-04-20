import java.util.Objects;

/**
 * Class representing a mountain made of a specific material
 */
public class Mountain implements SomeTypeOfStone {

    private final Material material;

    /**
     * Constructs a mountain with the specified material
     *
     * @param material material
     */
    public Mountain(Material material) {
        this.material = material;
    }

    @Override
    public Material getMaterial() {
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
        return "Гора из " + material.getProperties();
    }
}
