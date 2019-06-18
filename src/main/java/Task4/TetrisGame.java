package Task4;

public class TetrisGame {

 StandartFigCreator standartFigCreator = new StandartFigCreator();
 SuperFigCreator superFigCreator = new SuperFigCreator();


    public void playGame() {

        int randomFigureSet = 1 + (int) (Math.random() * 5);

        for (int i = 0; i < randomFigureSet ; i++) {
            System.out.println((standartFigCreator.createFigure()).getName());
        }
        System.out.println((superFigCreator.createFigure()).getName());
    }
}
