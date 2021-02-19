package top.psiphonc.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void studentTest() {
        final ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        final Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
