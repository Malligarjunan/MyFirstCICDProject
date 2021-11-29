package com.sag.spring.gitcicd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class GitCicdApplicationTests {

    @Test
    void contextLoads() {
        boolean isTrue = true;
        Assert.isTrue(isTrue, "It is not true");
    }

}
