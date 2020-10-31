package com.shazam.framework.build;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author shazam
 * @DATE 2019/1/5
 */
@SpringBootApplication
@EnableAspectJAutoProxy
@EnableJpaRepositories("com.shazam.framework.dao")
@EntityScan("com.shazam.framework.entity")
@ComponentScan("com.shazam.framework")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
