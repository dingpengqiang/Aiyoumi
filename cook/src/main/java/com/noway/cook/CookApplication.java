package com.noway.cook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author noway
 */
@SpringBootApplication(scanBasePackages = "com.noway")
public class CookApplication {

    public static void main(String[] args) {
        SpringApplication.run(CookApplication.class, args);
    }

}
