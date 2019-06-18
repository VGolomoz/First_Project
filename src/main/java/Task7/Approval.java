package Task7;

public class Approval implements State {

    Grant grant;

    public Approval(Grant grant) {
        this.grant = grant;
    }

    @Override
    public void currentState() {
        System.out.println("Waiting for approval..");
        grant.getDelayed().currentState();
    }
}
