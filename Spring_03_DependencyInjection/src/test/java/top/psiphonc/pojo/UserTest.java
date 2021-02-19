package top.psiphonc.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void userTest() {
        final ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        final User user = context.getBean("user2", User.class);
        System.out.println(user);
    }
}
