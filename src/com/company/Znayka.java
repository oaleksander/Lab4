package com.company;

import java.util.Objects;

public class Znayka extends Human {

    private static final String nickname = "Знайка";
    private Mood mood;
    public Znayka() {
        super(nickname);
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public String lookAtRock(StoneObject mountain) throws MountainCheckingException {
        String response;
        try {
            if (mountain.getClass() == CoolMountain.class) {
                response = this.toString() + " нашел " + mountain.toString() + ". Какая радость!";
                setMood(Mood.HAPPY);
            } else {
                setMood(Mood.SAD);
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException err) {
            throw new MountainCheckingException(mountain.toString() + " не содержит " + new CoolMountain().getMaterial().getProperties(), err);
        }
        return response;
    }

    public void CompareMoonWithPancake(Moon moon, Pancake pancake) {
        moon.compareTo(pancake);
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

    public static class MountainCheckingException extends Exception {
        public MountainCheckingException(String errorMessage, Throwable err) {
            super(errorMessage, err);
        }
    }
}
