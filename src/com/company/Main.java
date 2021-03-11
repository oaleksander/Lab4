package com.company;

public class Main {
    public static void main(String[] args) {
        Moon moon = new Moon(new Mountain(new Ruins()), "крупное космическое тело");
        Pancake pancake = new Pancake("несчастный из прокисшего теста");
        Znayka znayka = new Znayka();
        try {
            znayka.CompareMoonWithPancake(moon, pancake);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(znayka.lookAtRock(moon.getGround()));
        } catch (Znayka.MountainCheckingException e) {
            System.out.println(e.getMessage());
        }
    }
}
