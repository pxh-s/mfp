package com.mfp.controller;

import com.mfp.entity.ItemInfo;
import com.mfp.service.ItemInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/iteminfo")
public class ItemInfoController {

    @Autowired
    private ItemInfoService itemInfoService;

    @RequestMapping("/select")
    public Object select(){
        itemInfoService.list();
        return null;
    }

    @RequestMapping("/save")
    public Object save(@RequestBody ItemInfo request){
        itemInfoService.save(null);
        return null;
    }

    @RequestMapping("/update")
    public Object update(@RequestBody ItemInfo request){
        itemInfoService.updateById(request);
        return null;
    }

    @RequestMapping("/delete")
    public Object delete(@RequestBody String id){
        itemInfoService.removeById(id);
        return null;
    }
}
