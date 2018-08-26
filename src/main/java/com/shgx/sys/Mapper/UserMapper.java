package com.shgx.sys.Mapper;

import com.shgx.sys.Entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * Created by gshan on 2018/8/25
 */
@Mapper
@Component
public interface UserMapper {
    @Select("select * from users where userId = #{userId}")
    User findUserByUserid(String userId);
    @Insert("insert into users (userId,pwd) values (#{userId},#{pwd})")
    boolean insertUsers (String userId, String pwd);
}
