package Task7;

public class Grant {

    private State state;
    private int count = 0;

    public Grant(int amountGrants){
        count = amountGrants;
        if(count > 0) state = new Created(this);
        else state = this.getRecall();
    }

    public void createRequest(){
        if(count == 0) state = this.getRecall();
        state.currentState();
    }

    void sendGrant(){
        System.out.println("Congratulations, you got a grant for free education!");
        if (count != 0) count--;
    }

    public int getCount() {
        return count;
    }

    public State getApproval() {
        return new Approval(this);
    }

    public State getConfirmed() {
        return new Confirmed(this);
    }

    public State getDelayed() {
        return new Delayed(this);
    }

    public State getRecall() {
        return new Recall(this);
    }

    public State getDenied() {
        return new Denied(this);
    }

    public State getWin() {
        return new Win(this);
    }
}
