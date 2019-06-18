package Task7;

import java.util.Random;

public class Confirmed implements State {

    Grant grant;
    Random randomWinner = new Random(System.currentTimeMillis());

    public Confirmed(Grant grant) {
        this.grant = grant;
    }

    @Override
    public void currentState() {
        System.out.println("Your grant application confirmed. Waiting for a decision");
        for (int i = 2; i < 6 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            System.out.println(i + " days..");
        }
        int winner = randomWinner.nextInt(2);
        if (winner == 0) grant.getWin().currentState();
        else grant.getDenied().currentState();
    }
}
