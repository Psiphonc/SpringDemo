package top.psiphonc.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.psiphonc.pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest {

    @Test
    public void selectUser() {
        final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        apply(context,"userMapper");
        apply(context,"userMapper2");

    }

    private void apply(ApplicationContext context, String mapper) {
        final UserMapper userMapper = context.getBean(mapper, UserMapper.class);
        final List<User> users = userMapper.selectUser();
        users.forEach(System.out::println);
    }
}