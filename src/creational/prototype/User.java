package creational.prototype;

import java.util.Objects;

public class User implements Clone {

    private int id;

    private String name;

    public User() {
    }

    private User(User target) {
        if (target != null) {
            this.id = target.id;
            this.name = target.name;
        }
    }

    @Override
    public User copy() {
        return new User(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }
}
