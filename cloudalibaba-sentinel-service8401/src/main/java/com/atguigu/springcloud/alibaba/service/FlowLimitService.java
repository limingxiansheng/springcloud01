package com.atguigu.springcloud.alibaba.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @createTime : 2022/9/26 20:59
 */
@Service
public class FlowLimitService {
    @SentinelResource(value = "common")
    public void common()
    {
        System.out.println("------FlowLimitService come in");
    }

}
