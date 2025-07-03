package com.vuongkma.leetcodejava;

import com.vuongkma.leetcodejava.Easy.ValidPalindrome;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeetcodeJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeetcodeJavaApplication.class, args);
        BoilerplateInterface test = new ValidPalindrome();
        test.run();
    }

}
