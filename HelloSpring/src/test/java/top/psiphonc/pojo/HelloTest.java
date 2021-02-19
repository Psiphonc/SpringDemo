package top.psiphonc.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
    @Test
    public void MyTest() {
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //对象都在Spring容器中管理，要用只需要取出
        final Hello hello = context.getBean(Hello.class);
        System.out.println(hello);
        //要点：Hello实例是spring容器创建的
    }
}
