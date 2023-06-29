package com.mfp.controller;

import com.alibaba.fastjson.JSON;
import com.mfp.entity.Product;
import com.mfp.entity.TestEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {
// 跨域请求处理
//    @CrossOrigin(origins = "http://192.168.152.216:8080")
    @RequestMapping("/test")
    public String test(){
        List<TestEntity> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new TestEntity());
        }

        Map<String,Object> map = new HashMap<>();
        map.put("data",list);
        return JSON.toJSON(map).toString();
    }

//    @CrossOrigin(origins = "http://192.168.55.216:8080")
    @RequestMapping("/productList")
    public String productList(){
        List<Product> list = new ArrayList<>();
        String url = "https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png";
        for (int i = 0; i < 10; i++) {
            list.add(new Product("名称"+i,"详情"+i,(i+1)*1.0,url));
        }

        Map<String,Object> map = new HashMap<>();
        map.put("data",list);
        return JSON.toJSON(map).toString();
    }


}
