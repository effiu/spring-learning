package com.effiu.dto;

/**
 * @author zhangshuai
 * @date 2021/7/27 11:41 上午
 */
public class Person {

    private String name;

    private int age;

    private boolean sex;

    Person(){}

    Person(String name, int age, boolean sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public boolean isSex() {
        return sex;
    }

    public Person setSex(boolean sex) {
        this.sex = sex;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", sex=" + sex +
            '}';
    }
}
