package behavioral.strategy;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String strategy = scanner.next();

        Order order = new Order();
        PayStrategy payStrategy = null;

        if (strategy.equals("1")) {
            payStrategy = new PayByCreditCard();
        } else if (strategy.equals("2")) {
            payStrategy = new PayByWebMoney();
        }

        order.setPayStrategy(payStrategy);
        order.payByStrategy(100);

    }

}
