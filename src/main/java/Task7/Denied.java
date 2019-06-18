package Task7;

public class Denied implements State {

    Grant grant;

    public Denied(Grant grant) {
        this.grant = grant;
    }

    @Override
    public void currentState() {
        System.out.println("Sorry, your grant application was denied. You can try the next year.");
    }
}
