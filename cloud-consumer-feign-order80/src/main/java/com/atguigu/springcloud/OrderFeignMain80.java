package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @auther zzyy
 * @create 2020-02-03 11:55
 */
@SpringBootApplication
@EnableFeignClients//启用feign客户端 //定义服务+绑定接口，以声明式的方法优雅而简单的实现服务调用
public class OrderFeignMain80
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderFeignMain80.class,args);
    }
}