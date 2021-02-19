package top.psiphonc.pojo;

public class User {
    String name;

    public void setName(String name) {
        System.out.println("Inside name setter...");
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    User() {
        System.out.println("Inside constructor with no args...");
    }

    User(String name) {
        System.out.println("Inside constructor with args...");
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
