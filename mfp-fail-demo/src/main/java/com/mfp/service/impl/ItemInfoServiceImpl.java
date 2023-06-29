package com.mfp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mfp.entity.ItemInfo;
import com.mfp.mapper.ItemInfoMapper;
import com.mfp.service.ItemInfoService;
import org.springframework.stereotype.Service;

@Service
public class ItemInfoServiceImpl extends ServiceImpl<ItemInfoMapper,ItemInfo> implements ItemInfoService {
}
