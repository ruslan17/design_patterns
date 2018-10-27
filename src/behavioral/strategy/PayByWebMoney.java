package behavioral.strategy;

public class PayByWebMoney implements PayStrategy {
    @Override
    public boolean pay(int paymentAmount) {

        System.out.println("Payed " +
                paymentAmount + " by web money");

        return true;
    }
}
