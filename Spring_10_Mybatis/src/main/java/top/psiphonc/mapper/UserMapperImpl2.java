package top.psiphonc.mapper;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import top.psiphonc.pojo.User;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> selectUser() {
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
}
