package Task5;

public class Vampire extends Character {
    public String nameClass = "Vampire";

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

