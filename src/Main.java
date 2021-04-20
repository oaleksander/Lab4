/**
 * Main Lab4 class
 * @version 2.1
 * @author Aleksandr Medvedev (s286511)
 */
public class Main {
    public static void main(String[] args) {
        Moon moon = new Moon(new Mountain(new Ruins()), "крупное космическое тело");
        System.out.println("Coздана " + moon);
        Pancake pancake = new Pancake("несчастный из прокисшего теста");
        System.out.println("Cоздан " + pancake);
        Znayka znayka = new Znayka();
        System.out.println("Cоздан " + znayka + ", он говорит: \"" + znayka.introduceYourself() + "\"");
        try {
            System.out.println(znayka.getName() + " попробует сравнить " + moon + " c " + pancake);
            znayka.CompareMoonWithPancake(moon, pancake);
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
        try {
            System.out.println("Теперь " + znayka.getName() +" попробует посмотреть на поверхность " + moon);
            System.out.println(znayka.lookAtRock(moon.getGround()));
        } catch (Znayka.MountainCheckingException e) {
            e.printStackTrace(System.err);
        }
    }
}
