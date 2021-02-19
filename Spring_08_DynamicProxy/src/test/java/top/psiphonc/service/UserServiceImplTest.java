package top.psiphonc.service;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class UserServiceImplTest {
    @Test
    public void userServiceImplTest() {
        final UserService userService = (UserService)Proxy.newProxyInstance(
                UserService.class.getClassLoader(),
                new Class[]{UserService.class}, new UserServiceLogHandler(new UserServiceImpl()));
        userService.add();
        userService.remove();
        userService.update();
        userService.select();
    }

}