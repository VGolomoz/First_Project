package Task5;

public abstract class Character {

    public MovementBehavior movement;

    public abstract void move(MovementBehavior mb);

    public void setMovement(MovementBehavior m){
        this.movement = m;
    }
}
