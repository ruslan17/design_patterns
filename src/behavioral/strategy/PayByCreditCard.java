package behavioral.strategy;

public class PayByCreditCard implements PayStrategy {
    @Override
    public boolean pay(int paymentAmount) {

        System.out.println("Payed " +
                paymentAmount + " by credit card");

        return true;
    }
}
