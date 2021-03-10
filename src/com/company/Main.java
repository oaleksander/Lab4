package com.company;

public class Main {
    public static void main(String[] args) {
        Znayka znayka = new Znayka();
        System.out.println(znayka.lookAtRock(new Mountain(new Ruins())));
        if (args.length != 0)
            if (args[0].equals("happyend"))
                System.out.println(znayka.lookAtRock(new CoolMountain()));
        System.out.println(znayka.getName() + " теперь с настроением " + znayka.getMood().label + ". ");
    }
}
