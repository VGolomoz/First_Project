package Task4;

import java.util.ArrayList;

public class StandartFigCreator extends FigureCreator {

    public static ArrayList<Figure> standartFigureList;

    public StandartFigCreator() {
        standartFigureList = new ArrayList<>();
        standartFigureList.add(new FigS());
        standartFigureList.add(new FigZ());
        standartFigureList.add(new FigT());
        standartFigureList.add(new FigL());
    }


    
    @Override
    public Figure createFigure() {
        int randomFig = (int) (Math.random() * 3);
        return standartFigureList.get(randomFig);
    }
}
