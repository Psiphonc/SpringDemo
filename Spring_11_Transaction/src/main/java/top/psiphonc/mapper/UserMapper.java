package top.psiphonc.mapper;

import org.apache.ibatis.annotations.Param;
import top.psiphonc.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAllUserList();
    User selectUserById(@Param("id") String id);
    int insertUser(User user);
    int deleteUser(@Param("id") String id);
}
