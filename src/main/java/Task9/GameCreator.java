package Task9;

import java.util.ArrayList;

public class GameCreator {

    ArrayList<String> availableMoves;
    Table table;
    Caretaker caretaker;
    String move;
    String moveAI;

    public GameCreator(){

        caretaker = new Caretaker();
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
        caretaker.setMemento(new Memento(move));
        caretaker.setMementoAI(new Memento(moveAI));
    }

    public void undo(){
        this.move = caretaker.getMemento().getMove();
        this.moveAI = caretaker.getMementoAI().getMove();
        availableMoves.add(move);
        availableMoves.add(moveAI);
        table.undoCage(move, moveAI);
    }

    public boolean checkWinner(){
        return table.checkWinner();
    }
}
