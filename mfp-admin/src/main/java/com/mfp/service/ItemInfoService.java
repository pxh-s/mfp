package com.mfp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mfp.entity.ItemInfo;
import com.mfp.entity.request.ItemInfoRequest;

public interface ItemInfoService extends IService<ItemInfo> {
    IPage<ItemInfo> selectPage(ItemInfoRequest request);
}
