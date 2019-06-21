package Task8;

public class Bank {

        public static void pay(Account account, double amount, String type) {

        Payment privilegesPayment = new PrivilegesPayment();
        Payment standartPayment = new StandartPayment();
        privilegesPayment.setNext(standartPayment);
        standartPayment.setNext(new CreditPayment());

        privilegesPayment.pay(account, amount, type);
    }
}
