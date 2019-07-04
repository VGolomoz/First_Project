package Task8;

public class Account {

    private double balance;

    public Account(double amount){
        this.balance = amount;
    }

    public double makePay(double amount){

        return this.balance - amount;
    }

    public double getBalance() {
        return balance;
    }
}
