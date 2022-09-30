package com.priyakdey.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("Application Context Test")
@SpringBootTest
class DemoApplicationTest {

    @Autowired
    ApplicationContext applicationContext;

    @DisplayName("application context should not be null")
    @Test
    void loadsContext () {
        assertNotNull(applicationContext);
    }

}