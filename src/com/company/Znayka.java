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

    public String lookAtRock(Mountain mountain) {
        String response;
        if (mountain.getClass() == CoolMountain.class) {
            response = this.toString() + " нашел " + mountain.toString() + ". Какая радость!";
            setMood(Mood.HAPPY);
        } else {
            response = this.toString() + " нашел " + mountain.toString() + ", но это не " + new CoolMountain().toString() + ". Жаль!";
            setMood(Mood.SAD);
        }
        return response;
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
}
