package com.gk_bk.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.gk_bk.mapper")
public class MyBatisConfig {
}


