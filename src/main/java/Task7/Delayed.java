package Task7;

public class Delayed implements State {

    Grant grant;

    public Delayed(Grant grant) {
        this.grant = grant;
    }

    @Override
    public void currentState() {
        System.out.println("Approval delayed..");
        for (int i = 1; i < 5 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            System.out.println(i + " week..");
        }
        grant.getConfirmed().currentState();
    }
}
