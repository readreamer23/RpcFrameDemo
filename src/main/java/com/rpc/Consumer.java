package com.rpc;

import com.rpc.service.TestApiService;

/**
 * 消费者--引用服务
 */
public class Consumer {

    public static void main(String[] args) throws Exception {
        System.out.println("消费者" );
        TestApiService service = RpcFrame.refer(TestApiService.class,ConfigUtil.HOST,ConfigUtil.PORT);
        System.out.println("consumer开始消费!" );
        for (int i = 0; i < 10; i ++) {
            String hello = service.getName("第" + i+"个");
            System.out.println(hello);
        }
    }



}
