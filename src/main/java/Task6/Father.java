package Task6;

public class Father implements Subscriber {

    String magazine;
    String newspaper;

    @Override
    public void receiveEdition(String magazine, String newspaper) {
        this.magazine = magazine;
        this.newspaper = newspaper;
    }

    @Override
    public void read() {
        System.out.println("Father reading: " + magazine + " " + newspaper);
    }
}
