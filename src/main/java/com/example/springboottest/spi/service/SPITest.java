package com.example.springboottest.spi.service;

import java.util.ServiceLoader;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName SPITest.java
 * @Description TODO
 * @createTime 2022年01月17日 16:52:00
 */
public class SPITest {
    public static void main(String[] args) {
        ServiceLoader<Animal> serviceLoader = ServiceLoader.load(Animal.class);
        for (Animal animal : serviceLoader) {
            animal.bark();
        }
    }
}
