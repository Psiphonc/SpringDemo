package top.psiphonc.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.psiphonc.pojo.User;

import java.util.List;

import static org.junit.Assert.*;

public class UserMapperImplTest {
    private static final ApplicationContext context;
    private static final UserMapper userMapper;
    private static final SqlSessionTemplate sqlSessionTemplate;


    static {
        context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        userMapper = context.getBean("userMapper", UserMapper.class);
        sqlSessionTemplate = context.getBean("sqlSessionTemplate", SqlSessionTemplate.class);
    }

    @Test
    public void selectAllUserList() {
        final List<User> users = userMapper.selectAllUserList();
        users.forEach(System.out::println);
    }

    @Test
    public void selectUserById() {
        final User user = userMapper.selectUserById("1");
        System.out.println(user);
    }

    @Test
    public void insertUser() {
        final int ret = userMapper.insertUser(new User("2", "Jerry", "123123"));
        Assert.assertEquals(1, ret);
    }

    @Test
    public void deleteUser() {
        final int ret = userMapper.deleteUser("2");
        Assert.assertEquals(1, ret);
    }
}