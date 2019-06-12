package Task5;

public class GameClient {
    public static void main(String[] args) {
        System.out.println("Start the game:");
        CreateHeroes newHero = new CreateHeroes();
        newHero.addHeroes(new Orc("Orc", 10, new Ability("Wolf Scroll", "Summons wolf for running")));
        newHero.addHeroes(new Elf("Elf", 7, new Ability("Sprint", "Gets wind speed")));
        newHero.addHeroes(new Pegasus("Pegasus", 3, new Ability("Magic Fly", "Uses wings for flying")));
        newHero.addHeroes(new Vampire("Vampire", 8, new Ability("Bat form", "Flying in bat form")));

    }

}
