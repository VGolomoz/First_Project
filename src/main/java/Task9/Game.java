package Task9;

import java.util.Scanner;

public class Game {

    public void play(){

        GameCreator gameCreator = new GameCreator();

        Scanner in = new Scanner(System.in);
        while(gameCreator.checkWinner()) {
            System.out.println("Do your move: ");
            String input = in.nextLine();
            if (input.equals("undo"))
                gameCreator.undo();
            else {
                try {
                    gameCreator.doMove(input);
                } catch (Exception e) {
                    System.err.println("Game the end");
                    break;
                }
            }
        }
    }
}
