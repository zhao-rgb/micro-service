package com.soft1851.contentcenter.service.impl;

import com.soft1851.contentcenter.dao.MidUserShareMapper;
import com.soft1851.contentcenter.domain.entity.MidUserShare;
import com.soft1851.contentcenter.service.MidUserShareService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author zhao
 * @className MidUserShareServiceImpl
 * @Description TODO
 * @Date 2020/10/16
 * @Version 1.0
 **/
@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MidUserShareServiceImpl implements MidUserShareService{
    private final MidUserShareMapper midUserShareMapper;


    @Override
    public List<MidUserShare> getMidUserSharesByUserId(int userId) {
        Example example = new Example(MidUserShare.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId",userId);
        List<MidUserShare> midUserShares = this.midUserShareMapper.selectByExample(example);
        List<MidUserShare> midUserSharesDeal;
//        midUserSharesDeal = midUserShares.stream()
//                .peek(midUserShare -> {
//                    midUserShare
//                })
        return null;
    }
}
