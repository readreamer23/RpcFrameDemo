package com.rpc;

import com.rpc.service.TestApiService;
import com.rpc.service.impl.TestApiServiceImpl;

/**
 * 服务提供者--暴露服务
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        System.out.println("服务提供者provider：");
        TestApiService service = new TestApiServiceImpl();
        RpcFrame.export(service, ConfigUtil.PORT);
        System.out.println("provider服务已经启动！ ");
    }

}
