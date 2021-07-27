package com.effiu;

import com.effiu.dto.Person;
import com.effiu.service.TestService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhangshuai
 * @date 2021/7/27 11:20 上午
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTests {

    /**
     * 前提: 需要在TestServiceImpl类上加@{@code service}注解
     * 若使用无参数构造方法，则需要指定扫描配置和刷新ApplicationContext容器。
     * <pre class="code">
     *  context.scan("com.effiu");
     *  context.refresh();
     * </pre>
     */
    @Test
    public void test1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.effiu");
        TestService bean = context.getBean(TestService.class);
        System.out.println(bean.test(100));
    }

    /**
     * 通过读取XML文件启动Spring容器，其会读取XML文件中的bean。
     *
     * @see #test1() 则需要使用注解启用{@code TestServiceImpl}
     */
    @Test
    public void test2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Person bean = context.getBean(Person.class);
        System.out.println(bean);
    }


}
