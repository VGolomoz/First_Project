package Task8;

public abstract class Payment {

    private Payment next;

    public void setNext(Payment next){
        this.next = next;
    }

    public abstract void pay(Account account, double amount, String type);

    public abstract boolean typePayment(String type);

}
