package com.shgx.sys.Mapper;

import com.shgx.sys.Entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.io.InputStream;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by gshan on 2018/8/25
 */
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
    public void test() {
        InputStream in = null;

        //加载Mybatis配置文件
        try {
            in = Resources.getResourceAsStream("mybatis.xml");
            //根据相关的mybatis配置文件， 创建连接SQLSessionFactory连接对象
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
            //创建出SQLSession对象
            SqlSession sqlSeesion = factory.openSession();
            //通过sqlSession取到映射接口
            UserMapper userMapper = sqlSeesion.getMapper(UserMapper.class);
            Boolean isInsert = userMapper.insertUsers("admin","admin");
            System.out.println(isInsert);
            assertTrue(isInsert);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
