package com.star.com.star.service.com.star.service.impl;

import com.star.com.star.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * Created by zhangdi on 2015/8/10.
 */

@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello Dubbo,Hello " + name;
    }
}

