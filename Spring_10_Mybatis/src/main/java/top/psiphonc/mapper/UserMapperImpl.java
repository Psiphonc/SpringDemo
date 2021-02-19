package top.psiphonc.mapper;

import lombok.Data;
import org.mybatis.spring.SqlSessionTemplate;
import top.psiphonc.pojo.User;

import java.util.List;

@Data
public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sqlSessionTemplate;
    @Override
    public List<User> selectUser() {
        return sqlSessionTemplate.getMapper(UserMapper.class).selectUser();
    }
}
