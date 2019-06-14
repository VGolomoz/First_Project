package Task5;

public class GameClient {
    public static void main(String[] args) {
        System.out.println("Start the game:");
        new Elf().move(new MagicFly());
        new Orc().move(new SummonWolf());
        new Pegasus().move(new MagicWings());
        new Vampire().move(new BatForm());

        new Elf().move(new SummonWolf());
    }

}
