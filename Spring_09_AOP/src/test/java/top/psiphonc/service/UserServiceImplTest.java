package top.psiphonc.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest {
    @Test
    public void userServiceImplTest() {
        final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        final UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

}