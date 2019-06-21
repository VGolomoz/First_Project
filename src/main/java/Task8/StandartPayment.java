package Task8;

public class StandartPayment extends Payment {

    private Payment next;
    private double standartTax;

    public void setNext(Payment next) {
        this.next = next;
    }

    @Override
    public void pay(Account account, double amount, String type) {
        standartTax = (amount + amount * 10 / 100);
        if ((controlAccount(account, amount)) && (typePayment(type)))
            System.out.println("Standart operation successful, your balance: " + account.makePay(standartTax));
        else if (!controlAccount(account, amount)) {
            System.out.println("Not enough money!");
        } else {
            System.out.println("This is not standart operation. Bank proceeding ..  ");
            if (next == null) System.out.println("Unsupported operation");
            else this.next.pay(account, amount, type);
        }
    }

    @Override
    public boolean typePayment(String type) {
        if (type.equals("Standart")) return true;
        else return false;
    }

    public boolean controlAccount(Account account, double standartTax) {
        boolean control;
        if (account.getBalance() < standartTax) control = true;
        else control = false;

        return control;
    }
}
