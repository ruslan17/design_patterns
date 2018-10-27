package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1);
        user1.setName("John");

        User user2 = user1.copy();
        String name = user2.getName();
        System.out.println(name);

        Circle circle = new Circle();
        circle.setRadius(10);

        Circle circle1 = circle.copy();
        int radius = circle1.getRadius();
        System.out.println(radius);

//        List<Clone> clones = new ArrayList<>();
//        clones.add(user1);
//        clones.add(circle);

    }

}
