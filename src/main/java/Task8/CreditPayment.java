package Task8;

public class CreditPayment extends Payment {

    private Payment next;
    private double creditTax;

    public void setNext(Payment next) {
        this.next = next;
    }

    @Override
    public void pay(Account account, double amount, String type) {
        creditTax = (amount + amount * 25 / 100);
        if (controlAccount(account, amount)) {System.out.println("Not enough money!");}
        else if (typePayment(type))
                System.out.println("Credit operation successful, your balance: " + account.makePay(creditTax));
            else {
                System.out.println("This is not credit operation. Bank proceeding ..  ");
                if (next == null) System.out.println("Unsupported operation");
                else this.next.pay(account, amount, type);
            }
        }

    @Override
    public boolean typePayment (String type){
        if (type.equals("Credit")) return true;
        else return false;
    }

    public boolean controlAccount (Account account, double creditTax){
        boolean control;
        if (account.getBalance() < creditTax) control = true;
        else control = false;

        return control;
    }
}