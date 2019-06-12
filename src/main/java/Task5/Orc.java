package Task5;

public class Orc implements Character {
    public String nameClass;
    public int power;
    public Ability ability;

    public Orc (String name, int power, Ability ability){
        this.nameClass = name;
        this.power = power;
        this.ability = ability;
    }


    @Override
    public void feature() {
        System.out.println("Class: " + nameClass);
        System.out.println("Attack Power: " + power);
        System.out.println("Ability: " + ability.getName()+ " - " + ability.getDescription());
        System.out.println("===================================================");
    }

}
