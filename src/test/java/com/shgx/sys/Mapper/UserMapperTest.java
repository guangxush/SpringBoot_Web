package com.shgx.sys.Mapper;

import com.shgx.sys.Entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.io.InputStream;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by gshan on 2018/8/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    @Transactional
    @Rollback(false)
    public void testUserMapper(){
        Assert.assertSame(true,userMapper.insertUsers("123","123"));
    }

    @Test
    @Transactional
    @Rollback(false)
    public void testFindUserByUserid(){
        Assert.assertNotNull(userMapper.findUserByUserid("123"));
    }

}
