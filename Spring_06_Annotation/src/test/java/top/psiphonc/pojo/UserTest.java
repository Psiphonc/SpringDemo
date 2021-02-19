package top.psiphonc.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void userTest() {
        final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        final User user = context.getBean(User.class);
        System.out.println(user.name);
    }
}