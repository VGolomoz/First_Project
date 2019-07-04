package Task7;

public class Created implements State {

    Grant grant;

    public Created(Grant grant){
        this.grant = grant;
    }

    @Override
    public void currentState() {
        System.out.println("Grant application created");
        grant.getApproval().currentState();
    }
}
