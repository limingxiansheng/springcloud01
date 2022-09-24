package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @auther zzyy
 * @create 2020-01-27 20:21
 */
@Mapper  //import org.apache.ibatis.annotations.Mapper;mybatis提供的，等价：@MapperScan("com.atguigu.springcloud.dao")
public interface PaymentDao
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
 
 
 
 
 
 

