import java.util.Objects;

public class Moon {

    final SomeTypeOfStone ground;

    final String description;

    public Moon(SomeTypeOfStone ground, String description) {
        this.ground = ground;
        this.description = description;
    }

    public int compareTo(Object o) {
        if (o.equals(this)) return 0;
        if (o instanceof Pancake)
            throw new FunnyComparisonException("Смешно сравнивать " + this + " c " + o);
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
        return Objects.hash(toString());
    }

    @Override
    public String toString() {
        return "Луна - " + getDescription();
    }

    public SomeTypeOfStone getGround() {
        return ground;
    }

    public String getDescription() {
        return description;
    }

    /**
     * Thrown to indicate that the comparison the moon to a particular object is funny and makes no sense
     */
    private static class FunnyComparisonException extends IllegalArgumentException {

        /**
         * Constructs a FunnyComparisonException with no detail message
         */
        public FunnyComparisonException() {
            super();
        }

        /**
         * Constructs a FunnyComparisonException with a specified detail message
         *
         * @param message the detail message
         */
        public FunnyComparisonException(String message) {
            super(message);
        }

        /**
         * Constructs a new FunnyComparisonException with a specified detail message and cause
         *
         * @param message the detail message
         * @param cause   the cause
         */
        public FunnyComparisonException(String message, Throwable cause) {
            super(message, cause);
        }

        /**
         * Constructs a new FunnyComparisonException with a specified cause
         *
         * @param cause the cause
         */
        public FunnyComparisonException(Throwable cause) {
            super(cause);

        }

    }
}
