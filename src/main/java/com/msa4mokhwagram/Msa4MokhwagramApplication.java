package com.msa4mokhwagram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class Msa4MokhwagramApplication {

    public static void main(String[] args) {
        SpringApplication.run(Msa4MokhwagramApplication.class, args);
    }

}
