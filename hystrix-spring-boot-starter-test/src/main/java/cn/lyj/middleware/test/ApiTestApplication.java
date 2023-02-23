package cn.lyj.middleware.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: midawller
 * @description:
 * @author: lyj
 * @create: 2023-02-23 20:44
 **/
@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"cn.lyj.middleware"})
public class ApiTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiTestApplication.class, args);
    }

}
