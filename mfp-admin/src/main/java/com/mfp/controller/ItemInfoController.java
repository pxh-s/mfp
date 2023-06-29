package com.mfp.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mfp.entity.ItemInfo;
import com.mfp.entity.request.ItemInfoRequest;
import com.mfp.response.CommonResult;
import com.mfp.response.ResultCode;
import com.mfp.service.ItemInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/iteminfo")
public class ItemInfoController {

    @Autowired
    private ItemInfoService itemInfoService;
    
//    @CrossOrigin(origins = "http://192.168.152.216:8080")
    @PostMapping ("/select")
    public CommonResult select(@RequestBody ItemInfoRequest request) {
        IPage<ItemInfo> result = itemInfoService.selectPage(request);
        if (result != null) {
            return CommonResult.success(result);
        } else {
            return CommonResult.failed(ResultCode.FAILED);
        }
    }

//    @CrossOrigin(origins = "http://192.168.152.216:8080")
    @GetMapping("/get/{id}")
    public CommonResult getItemInfoById(@PathVariable("id") Long id) {
        ItemInfo itemInfo = itemInfoService.getById(id);
        if (itemInfo != null) {
            return CommonResult.success(itemInfo);
        } else {
            return CommonResult.failed(ResultCode.FAILED);
        }
    }

    @PostMapping("/create")
    public CommonResult createItemInfo(@RequestBody ItemInfo itemInfo) {
        boolean success = itemInfoService.save(itemInfo);
        if (success) {
            return CommonResult.success();
        } else {
            return CommonResult.failed(ResultCode.FAILED);
        }
    }

    @PostMapping("/update/{id}")
    public CommonResult updateItemInfo(@PathVariable("id") Long id, @RequestBody ItemInfo itemInfo) {
        itemInfo.setItemId(id);
        boolean success = itemInfoService.updateById(itemInfo);
        if (success) {
            return CommonResult.success();
        } else {
            return CommonResult.failed(ResultCode.FAILED);
        }
    }

    @DeleteMapping("/delete/{id}")
    public CommonResult deleteItemInfo(@PathVariable("id") Long id) {
        boolean success = itemInfoService.removeById(id);
        if (success) {
            return CommonResult.success();
        } else {
            return CommonResult.failed(ResultCode.ITEM_DELETE_FAILED);
        }
    }
}
