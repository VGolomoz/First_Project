package Task9;

import java.util.ArrayList;

public class GameCreator {

    ArrayList<String> availableMoves;
    Table table;
    Memento memento;
    String move;
    String moveAI;

    public GameCreator(){

        memento = new Memento();
        availableMoves = new ArrayList<>(9);
        for (int i = 0; i <9 ; i++) {
            availableMoves.add(""+i);
        }
        table = new Table();
        table.makeTable();
    }

    public void doMove(String move) throws Exception{
        this.move = move;
        setMoveAI();
        saveMove();
        table.setCage(move, moveAI);
    }

    private void setMoveAI() throws Exception {
        availableMoves.remove(move);
        int index = (int) (Math.random() * availableMoves.size());
        moveAI = availableMoves.get(index);
        availableMoves.remove(moveAI);
    }

    public void saveMove(){
        memento.saveMove(move, moveAI);
    }

    public void undo(){
        try {
            this.move = memento.getMove();
            this.moveAI = memento.getMoveAI();
            availableMoves.add(move);
            availableMoves.add(moveAI);
            table.undoCage(move, moveAI);
        } catch (Exception e){
            System.err.println("You cant do 'undo' before move!");
        }
    }

    public boolean checkWinner(){
        return table.checkWinner();
    }
}
