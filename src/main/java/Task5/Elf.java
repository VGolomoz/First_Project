package Task5;

public class Elf extends Character {
    private String nameClass = "Elf";


    public String getName() {
        return nameClass;
    }

    @Override
    public void move(MovementBehavior mb) {
    System.out.print(this.nameClass  + ": ");
    super.setMovement(mb);
    super.movement.useMovement();
    }
}
