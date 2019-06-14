package Task5;

public class Orc extends Character {
    public String nameClass = "Orc";

    public String getName() {
        return nameClass;
    }

    @Override
    public void move(MovementBehavior mb) {
        System.out.print(this.nameClass + ": ");
        super.setMovement(mb);
        super.movement.useMovement();
    }
}
