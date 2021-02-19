package top.psiphonc.mapper;

import lombok.Data;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import top.psiphonc.pojo.User;

import java.util.List;

@Data
public class UserMapperImpl implements UserMapper{
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<User> selectAllUserList() {
        return sqlSessionTemplate.getMapper(UserMapper.class).selectAllUserList();
    }

    @Override
    public User selectUserById(String id) {
        return sqlSessionTemplate.getMapper(UserMapper.class).selectUserById(id);
    }

    @Override
    public int insertUser(User user) {
        return sqlSessionTemplate.getMapper(UserMapper.class).insertUser(user);
    }

    @Override
    public int deleteUser(String id) {
        return sqlSessionTemplate.getMapper(UserMapper.class).deleteUser(id);
    }
}
