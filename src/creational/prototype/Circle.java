package creational.prototype;

import java.util.Objects;

public class Circle implements Clone {

    private int radius;

    public Circle() {
    }

    private Circle(Circle target) {
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Circle copy() {
        return new Circle(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {

        return Objects.hash(radius);
    }
}
