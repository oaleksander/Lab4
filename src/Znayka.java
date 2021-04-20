import java.util.Objects;

/**
 * Class representing the Znayka person
 */
public class Znayka extends Human {

    private static final String nickname = "Знайка";
    private Mood mood;

    /**
     * Constructs a Znayka (custom name cannot be specified)
     */
    public Znayka() {
        super(nickname);
    }

    /**
     * Gets the Znayka's mood
     *
     * @return mood
     */
    public Mood getMood() {
        return mood;
    }

    /**
     * Sets the Znayka's mood
     *
     * @param mood new mood
     */
    public void setMood(Mood mood) {
        this.mood = mood;
    }

    /**
     * Makes Znayka look at a specified mountain and analyze it
     *
     * @param mountain mountain to look at
     * @return Znayka's response
     * @throws MountainCheckingException if Znayka disliked the mountain and became too frustrated to respond
     */
    public String lookAtRock(SomeTypeOfStone mountain) throws MountainCheckingException {
        String response;
        try {
            if (mountain.getClass() == CoolMountain.class) {
                response = this + " нашел " + mountain + ". Какая радость!";
                setMood(Mood.HAPPY);
            } else {
                setMood(Mood.SAD);
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException err) {
            throw new MountainCheckingException(mountain + " не содержит " + new CoolMountain().getMaterial().getProperties(), err);
        }
        return response;
    }

    /**
     * Makes Znayka compare a moon with a pancake
     *
     * @param moon    specified moon
     * @param pancake specified pancake
     */
    public void CompareMoonWithPancake(Moon moon, Pancake pancake) {
        System.out.println("Знайка сравнил " + moon + "c " + pancake + ". В результате получилось " + moon.compareTo(pancake));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Znayka)) return false;
        Znayka znayka = (Znayka) o;
        return getMood() == znayka.getMood();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMood());
    }

    @Override
    String introduceYourself() {
        return "Я - " + nickname + "! Автор блинной теории о космических телах!";
    }

    /**
     * Thrown to indicate that Znayka became frustrated after looking at a mountain
     */
    public static class MountainCheckingException extends Exception {

        /**
         * Constructs a MountainCheckingException with no detail message
         */
        public MountainCheckingException() {
            super();
        }

        /**
         * Constructs a MountainCheckingException with a specified detail message
         *
         * @param message the detail message
         */
        public MountainCheckingException(String message) {
            super(message);
        }

        /**
         * Constructs a new MountainCheckingException with a specified detail message and cause
         *
         * @param errorMessage the detail message
         * @param err          the cause
         */
        public MountainCheckingException(String errorMessage, Throwable err) {
            super(errorMessage, err);
        }

        /**
         * Constructs a new MountainCheckingException with a specified cause
         *
         * @param cause the cause
         */
        public MountainCheckingException(Throwable cause) {
            super(cause);
        }
    }
}
