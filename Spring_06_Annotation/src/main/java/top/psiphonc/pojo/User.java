package top.psiphonc.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

//等价于在bean.xml中注册了一个bean
@Component
//bean的作用域
@Scope("prototype")
public class User {
    //注入属性
    @Value("Tom")
    public String name;

    public List<String> hobbies;

}
