package com.example.springboottest.config;

import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ContainerProperties;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName KafkaConfig.java
 * @Description
 * @createTime 2023年03月02日 17:07:00
 */
@Configuration
public class KafkaConfig implements ApplicationContextAware {

    private final KafkaProperties kafkaProperties;

    public static final String CUSTOM_CONTAINER_FACTORY = "ackContainerFactory";

    private ApplicationContext context;


    public KafkaConfig(KafkaProperties kafkaProperties) {
        this.kafkaProperties = kafkaProperties;
    }


    @Bean
    public ConsumerFactory<String, String> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(kafkaProperties.buildConsumerProperties());
    }

    @Bean(CUSTOM_CONTAINER_FACTORY)
    public ConcurrentKafkaListenerContainerFactory<String, String> ackContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        factory.getContainerProperties().setAckMode(ContainerProperties.AckMode.MANUAL_IMMEDIATE);
        factory.setConcurrency(1);
        return factory;
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }}
