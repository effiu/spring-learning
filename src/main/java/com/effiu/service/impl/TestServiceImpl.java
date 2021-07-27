package com.effiu.service.impl;

import com.effiu.service.TestService;

import org.springframework.stereotype.Service;

/**
 * @author zhangshuai
 * @date 2021/7/27 11:11 上午
 */
//@Service
public class TestServiceImpl implements TestService {

    @Override
    public int test(int i) {
        return i;
    }
}
