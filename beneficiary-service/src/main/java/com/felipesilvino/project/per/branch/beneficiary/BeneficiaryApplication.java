package com.felipesilvino.project.per.branch.beneficiary;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BeneficiaryApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        new BeneficiaryApplication()
                .configure(new SpringApplicationBuilder())
                .run(args);
    }
}
