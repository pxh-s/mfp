package com.mfp.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TestEntity {
    private Date date = new Date();
    private String name = "张三";
    private String address = "测试地址";
}
