package com.ztq.demo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ztq.demo.api.DemoService;

@Service
public class DemoServiceAnnoImpl implements DemoService {
    public String sayHello(String name) {
        return "你好："+name;
    }
}
