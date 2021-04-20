/**
 * Class representing a Mountain, but cooler: it is made of ancient stone remnants
 */
public class CoolMountain extends Mountain implements SomeTypeOfStone {

    private static final Material material = () -> "Куски горной породы";

    /**
     * Constructs a cool mountain
     */
    public CoolMountain() {
        super(material);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ material.hashCode();
    }

    @Override
    public String toString() {
        return "Крутая гора из " + material.getProperties();
    }
}
