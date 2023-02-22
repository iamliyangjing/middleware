package cn.lyj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: midawller
 * @description:
 * @author: lyj
 * @create: 2023-02-22 22:05
 **/
@SpringBootApplication
@ComponentScan(basePackages = {"cn.lyj.*"})
public class ApiTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiTestApplication.class);
    }
}
