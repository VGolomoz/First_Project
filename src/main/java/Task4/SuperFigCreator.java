package Task4;

public class SuperFigCreator extends FigureCreator {

    @Override
    public Figure createFigure() {
        return new SuperFigure();
    }
}
