package com.qinchy.saas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.qinchy.saas"})
public class SaasAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaasAdminApplication.class, args);
    }
}
