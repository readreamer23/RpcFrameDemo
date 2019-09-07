package com.rpc.service.impl;

import com.rpc.service.TestApiService;

/**
 * 测试业务服务接口实现
 */
public class TestApiServiceImpl implements TestApiService {

    public String getName(String name) {
        return "name-" + name;
    }

}
