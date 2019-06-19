package Task9;

import java.util.ArrayList;

public class Memento {

    private ArrayList<String> moves = new ArrayList<>();
    private ArrayList<String> movesAI = new ArrayList<>();

    public void saveMove(String move, String moveAI){
        this.moves.add(move);
        this.movesAI.add(moveAI);
    }

    public String getMove() {
        String oldMove = moves.get(moves.size()-1);
        moves.remove(moves.size()-1);
        return oldMove;
    }

    public String getMoveAI(){
        String oldMove = movesAI.get(movesAI.size()-1);
        movesAI.remove(movesAI.size()-1);
        return oldMove;
    }
}
