package top.psiphonc.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
    @Test
    public void personTest() {
        final ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        final Person person = context.getBean("person", Person.class);
        System.out.println(person);
        person.getCat().bark();
        person.getDog().bark();
    }
}
