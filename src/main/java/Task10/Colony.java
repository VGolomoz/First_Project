package Task10;

import java.util.ArrayList;
import java.util.List;

public class Colony {

    private List<Bacterium> myColony = new ArrayList<>();

    public void makeBacterium(String name) {
        Bacterium bacterium = BacteriumFactory.getBacterium(name);
        myColony.add(bacterium);
    }

    public void makeColony(int colonySize) {

        int multiplier = 1;
        makeBacterium("New bacterium");

        long startTime = System.currentTimeMillis();
        while(myColony.size() < colonySize) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            for (int i = 0; i < multiplier; i++) {
                if (myColony.size() < colonySize)
                    makeBacterium("New bacterium");
                else break;
            }
            multiplier = multiplier * 2;
            System.out.println("Colony population: " + myColony.size());
        }

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println(timeSpent + " millis");
        //System.out.println(bacteriumList.get(0).equals(bacteriumList.get(99999)));
    }
}
