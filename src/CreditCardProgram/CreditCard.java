package CreditCardProgram;

public class CreditCard {
    // instance variables
    private String number, name, bank;
    private double balance;
    private int limit;

    // constructor
    public CreditCard(String number, String name, String bank, double balance, int limit) {
        this.number = number;
        this.name = name;
        this.bank = bank;
        this.balance = balance;
        this.limit = limit;
    }

    // empty constructor
    public CreditCard() {
    }

    public static void printCard(CreditCard card) {
        System.out.println("Number = " + card.getNumber());
        System.out.println("Name = " + card.getName());
        System.out.println("Bank = " + card.getBank());
        System.out.println("Balance = " + card.getBalance());
        System.out.println("Limit = " + card.getLimit());
        System.out.println();
    }

    // accessor methods
    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    // action methods
    public boolean chargeIt(double price) {
        if (price + balance > (double) limit) {
            return false;
        } else {
            balance += price;
            return true;
        }
    }

    public void makePayment(double payment) {
        balance -= payment;
    }
}
