package top.psiphonc.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void userTest() {
        final ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        final User user = context.getBean("fuck",User.class);
        System.out.println(user);
    }
}
