package com.sb_pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//怎么打成war包 3.提供springboot项目启动器（初始化项目内部servlet组件） extends SpringBootServletInitializer
@SpringBootApplication
public class SbSpckApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbSpckApplication.class, args);
    }

    //#重写一个父类中的方法confiure()，执行初始化项目的启动类
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
////        return super.configure(builder);
//        return builder.sources(SbSpckApplication.class);
//    }
}
