package top.psiphonc.dao;

public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("getting a user from mysql");
    }
}
