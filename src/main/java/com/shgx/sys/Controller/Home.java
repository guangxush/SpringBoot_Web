package com.shgx.sys.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by gshan on 2018/8/25
 */
@RestController
@RequestMapping({"/index","/"})
public class Home {
    @RequestMapping(method = GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String home() {
        return "index";
    }
}
