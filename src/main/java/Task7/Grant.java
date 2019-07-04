package Task7;

public class Grant {

    private State created;
    private State approval;
    private State delayed;
    private State confirmed;
    private State denied;
    private State recall;
    private State win;

    private State state = created;
    private int count = 0;

    public Grant(int amountGrants){
        created = new Created(this);
        approval = new Approval(this);
        delayed = new Delayed(this);
        confirmed = new Confirmed(this);
        denied = new Denied(this);
        recall = new Recall(this);
        win = new Win(this);

        count = amountGrants;
        if(count > 0) state = created;
        else state = recall;
    }

    public void createRequest(){
        if(count == 0) state = recall;
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
        return approval;
    }

    public State getConfirmed() {
        return confirmed;
    }

    public State getDelayed() {
        return delayed;
    }

    public State getRecall() {
        return recall;
    }

    public State getDenied() {
        return denied;
    }

    public State getWin() {
        return win;
    }
}
