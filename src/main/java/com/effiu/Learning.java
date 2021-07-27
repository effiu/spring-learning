package com.effiu;

import com.effiu.service.TestService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhangshuai
 * @date 2021/7/27 11:13 上午
 */
public class Learning {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.effiu");
        // 若使用无参数构造方法，则需要指定扫描配置和刷新ApplicationContext容器。
//        context.scan("com.effiu");
//        context.refresh();
        TestService bean = context.getBean(TestService.class);
        System.out.println(bean.test(100));
    }
}
