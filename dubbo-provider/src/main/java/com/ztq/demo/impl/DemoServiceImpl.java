package com.ztq.demo.impl;

import com.ztq.demo.api.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "hello dubbo"+" "+name ;
    }

}
