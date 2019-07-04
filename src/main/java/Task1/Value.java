package Task1;

public class Value implements SubExpression {

    private Double value;

    public Value (Double value){
        this.value = value;
    }

    @Override
    public Double getValue() {
        return value;
    }

    @Override
    public void add(SubExpression expr) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void operation(String op) {
        throw new UnsupportedOperationException();
    }
}
