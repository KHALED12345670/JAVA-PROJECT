package com.exam;

import org.junit.Test;

public class AppTest {

    @Test
    public void testEnv() {
        System.out.println("Environment: " + System.getProperty("env.name"));
    }
}
