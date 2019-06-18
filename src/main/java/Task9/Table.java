package Task9;

import java.util.ArrayList;

public class Table {

    ArrayList<String> cages;

    public Table() {

        cages = new ArrayList<>(9);
        for (int i = 0; i < 9; i++) {
            cages.add("" + i);
        }
    }

    public void setCage(String move, String moveAI) {
        cages.set(Integer.parseInt(move), "X");
        cages.set(Integer.parseInt(moveAI), "O");
        makeTable();
    }

    public void undoCage(String move, String moveAI) {
        cages.set(Integer.parseInt(move), move);
        cages.set(Integer.parseInt(moveAI), moveAI);
        makeTable();
    }

    public void makeTable() {

        String leftAlignFormat = "| %-2s | %-2s | %-2s |%n";
        System.out.format("+----+----+----+%n");

        System.out.format(leftAlignFormat, cages.get(0), cages.get(1), cages.get(2));
        System.out.format("+----+----+----+%n");
        System.out.format(leftAlignFormat, cages.get(3), cages.get(4), cages.get(5));
        System.out.format("+----+----+----+%n");
        System.out.format(leftAlignFormat, cages.get(6), cages.get(7), cages.get(8));
        System.out.format("+----+----+----+%n");

    }

    public boolean checkWinner() {

        boolean flag = true;

        for (int i = 0; i < cages.size()-2; i += 3) {
            if (cages.get(i).equals("X") && cages.get(i + 1).equals("X") && cages.get(i + 2).equals("X")) {
                flag = false;
                System.out.println("Congratulations! You a winner");
            }
        }
        for (int i = 0; i < cages.size()-6; i++) {
            if (cages.get(i).equals("X") && cages.get(i + 3).equals("X") && cages.get(i + 6).equals("X")) {
                flag = false;
                System.out.println("Congratulations! You a winner");
            }
        }

        for (int i=0, j=4; j>0; i+=2, j-=2) {
            if (cages.get(i).equals("X") && cages.get(i+j).equals("X") && cages.get(i+2*j).equals("X")){
                flag = false;
                System.out.println("Congratulations! You a winner");
            }
        }

        return flag;
    }
}
