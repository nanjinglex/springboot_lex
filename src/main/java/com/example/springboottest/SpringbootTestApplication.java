package com.example.springboottest;


import com.example.springboottest.util.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableConfigurationProperties
//@ComponentScan(basePackages={"com.example"}) // 扫描该包路径下的所有spring组件
//@Import(SpringUtil.class)
public class SpringbootTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTestApplication.class, args);
    }

//    @Bean
//    public SpringUtil getSpringUtil() {
//        return new SpringUtil();
//    }

}
