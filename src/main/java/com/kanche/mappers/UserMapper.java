package com.kanche.mappers;

import com.kanche.models.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by xialei on 16/3/29.
 */
public interface UserMapper {

    @Select("SELECT * FROM user WHERE username = #{username} and password = #{password}")
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
