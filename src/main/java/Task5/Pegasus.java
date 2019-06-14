package Task5;

public class Pegasus extends Character {
    public String nameClass = "Pegasus";

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
