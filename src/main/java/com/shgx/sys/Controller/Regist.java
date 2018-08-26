package com.shgx.sys.Controller;

import com.shgx.sys.Entity.User;
import com.shgx.sys.Services.IRegService;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.shgx.sys.util.CreateMD5;

/**
 * Created by gshan on 2018/8/25
 */
@Controller
@RequestMapping("/sys")
public class Regist {

    @Autowired
    private IRegService regService;

    @RequestMapping(value = "/reg",method = RequestMethod.POST)
    @ResponseBody
    Boolean reg(@RequestParam(value = "userId", required = true) String userId,
                @RequestParam(value = "pwd", required = true) String pwd){
        String md5pwd = CreateMD5.creatMD5(pwd);
        System.out.println(userId+":"+md5pwd);
        return regService.regUser(userId,md5pwd);
    }


    @RequestMapping(value = "/regjson",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    Boolean regjson(@RequestBody User user){
        System.out.println(user.toString());
        String md5pwd = CreateMD5.creatMD5(user.getPwd());
        System.out.println(user.getUserId()+":"+md5pwd);
        return regService.regUser(user.getUserId(),md5pwd);
    }
}
