package Task7;

public class Win implements State {

    Grant grant;

    public Win(Grant grant) {
        this.grant = grant;
    }

    @Override
    public void currentState() {
    grant.sendGrant();
    }
}
