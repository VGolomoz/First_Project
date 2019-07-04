package Task7;

public class Recall implements State {

    Grant grant;

    public Recall(Grant grant) {
        this.grant = grant;
    }

    @Override
    public void currentState() {
        System.out.println("There are no grants to study");
    }
}
