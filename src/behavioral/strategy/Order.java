package behavioral.strategy;

public class Order {

    private PayStrategy payStrategy;

    public void payByStrategy(int paymentAmount) {
        payStrategy.pay(paymentAmount);
    }

    public Order() {
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }
}
