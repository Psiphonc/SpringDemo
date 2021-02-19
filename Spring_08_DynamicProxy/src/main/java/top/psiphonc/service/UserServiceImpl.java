package top.psiphonc.service;

public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("added a user");
    }

    @Override
    public void remove() {
        System.out.println("removed a user");
    }

    @Override
    public void update() {
        System.out.println("updated a user");
    }

    @Override
    public void select() {
        System.out.println("queried a user");
    }
}
