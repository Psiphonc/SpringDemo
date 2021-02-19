package top.psiphonc.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserServiceLogHandler implements InvocationHandler {
    UserService userService;

    public UserServiceLogHandler() {
    }

    public UserServiceLogHandler(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        final String methodName = method.getName();
        System.out.printf("Inside %s...%n", methodName);
        return method.invoke(userService, args);
    }
}
