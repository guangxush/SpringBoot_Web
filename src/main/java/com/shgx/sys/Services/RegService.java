package com.shgx.sys.Services;

import com.shgx.sys.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gshan on 2018/8/25
 */
@Service
public class RegService implements IRegService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean regUser(String userId, String pwd) {

        Boolean flag ;
        try {
            System.out.println("2"+userId+":"+pwd);
            flag = userMapper.insertUsers(userId,pwd);
            System.out.println("3"+userId+":"+pwd);
        }catch (Exception e){
            return false;
        }
        return flag;
    }
}
