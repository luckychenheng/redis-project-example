package com.example.redisproject.controlles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.rmi.runtime.Log;

@Controller
public class RedisController {

    Logger logger = LoggerFactory.getLogger(RedisController.class);

    @RequestMapping (value = "/save",method = RequestMethod.GET)
    public @ResponseBody String saveValue(){
        logger.info("====> saveValue <====");
        return "saveValue";
    }
}
