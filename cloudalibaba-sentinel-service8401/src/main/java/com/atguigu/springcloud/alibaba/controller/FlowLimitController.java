package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.alibaba.service.FlowLimitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther zzyy
 * @create 2022-09-14 20:42
 */
@RestController
public class FlowLimitController
{
    @Autowired
    private FlowLimitService flowLimitService;

    @GetMapping("/testA")
    public String testA()
    {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB()
    {
        return "------testB";
    }

    //说明：C和D两个请求都访问flowLimitService.common()方法，对C限流，对D不管


    @GetMapping("/testC")
    public String testC()
    {
        flowLimitService.common();
        return "------testC";
    }
    @GetMapping("/testD")
    public String testD()
    {
        flowLimitService.common();
        return "------testD";
    }
}






