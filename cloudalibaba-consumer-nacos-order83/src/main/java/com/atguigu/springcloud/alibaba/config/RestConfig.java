package com.atguigu.springcloud.alibaba.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @createTime : 2022/9/26 18:38
 */
@Configuration
public class RestConfig {
  @Bean
  @LoadBalanced
  public RestTemplate getRestTemplate()
  {
    return new RestTemplate();
  }
}
