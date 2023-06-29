package com.mfp.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mfp.entity.ItemInfo;
import com.mfp.entity.request.ItemInfoRequest;
import com.mfp.mapper.ItemInfoMapper;
import com.mfp.service.ItemInfoService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class ItemInfoServiceImpl extends ServiceImpl<ItemInfoMapper,ItemInfo> implements ItemInfoService {
    @Override
    public IPage<ItemInfo> selectPage(ItemInfoRequest request) {
        LambdaQueryChainWrapper<ItemInfo> lambdaQueryWrapper = new LambdaQueryChainWrapper(baseMapper);

        Page<ItemInfo> page = new Page<>();
        page.setPages(request.getPageNum());
        page.setSize(request.getPageSize());

        if(!StringUtils.isEmpty(request.getItemName())){
            lambdaQueryWrapper.like(ItemInfo::getItemName,request.getItemName() );
        }

        if(!StringUtils.isEmpty(request.getItemPicUrl())){
            lambdaQueryWrapper.like(ItemInfo::getItemPicUrl,request.getItemPicUrl());
        }

        if(!StringUtils.isEmpty(request.getItemId())){
            lambdaQueryWrapper.eq(ItemInfo::getItemId,request.getItemId());
        }
        IPage<ItemInfo> itemInfoIPage = lambdaQueryWrapper.page(page);
        return itemInfoIPage;
    }
}
