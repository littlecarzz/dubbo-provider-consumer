package com.shawearn.dubbo.provider.impl;

import com.shawearn.dubbo.remote.TestService;

public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String name) {
        return "Hello"+name+"！";
    }
}
