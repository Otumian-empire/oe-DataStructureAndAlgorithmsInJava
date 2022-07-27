package CreditCardProgram;

public class Main {
    public static void main(String[] args) {
        CreditCard[] cards = new CreditCard[3];

        cards[0] = new CreditCard("123", "John", "Access Bank", 0.0, 2500);
        cards[1] = new CreditCard("124", "Lily", "Money Bank", 0.0, 3500);
        cards[2] = new CreditCard("125", "Daniel", "World Bank", 0.0, 5000);

        for (int i = 0; i < 5; i++) {
            cards[0].chargeIt(2.5 * i);
            cards[1].chargeIt(3.5 * i);
            cards[2].chargeIt( 3.0 * i);
        }

        for (CreditCard card: cards) {
           CreditCard.printCard(card);

           while (card.getBalance()>100) {
               card.makePayment(100.0);
               System.out.println("New balance = " + card.getBalance());
           }
        }
    }

}
