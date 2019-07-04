package Task8;

public class PrivilegesPayment extends Payment {

    private Payment next;

    public void setNext(Payment next) {
        this.next = next;
    }

    @Override
    public void pay(Account account, double amount, String type) {
        if  (controlAccount(account, amount)) { System.err.println("Not enough money!");}
            else if (typePayment(type))
                System.out.println("Privileges operation successful, your balance: " + account.makePay(amount));
            else {
                System.out.println("This is not privileges operation. Bank proceeding ..  ");
                if (next == null) System.out.println("Unsupported operation");
                else this.next.pay(account, amount, type);
            }
    }

    @Override
    public boolean typePayment(String type) {
        if (type.equals("Privileges")) return true;
        else return false;
    }

    public boolean controlAccount (Account account, double amount){
        boolean control;
        if (account.getBalance() < amount) control = true;
        else control = false;

        return control;
    }
  }