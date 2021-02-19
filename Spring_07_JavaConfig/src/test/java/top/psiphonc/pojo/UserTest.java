package top.psiphonc.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.psiphonc.config.PsiphoncConfig;

import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void userTest() {
        final ApplicationContext context = new AnnotationConfigApplicationContext(PsiphoncConfig.class);
        final User user = (User)context.getBean("fasdfa");
        System.out.println(user.getName());
    }
}