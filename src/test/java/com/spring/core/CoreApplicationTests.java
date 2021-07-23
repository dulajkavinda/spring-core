package com.spring.core;

import com.spring.core.services.PaymentService;
import com.spring.core.services.PaymentServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
class CoreApplicationTests {

    @Autowired
    PaymentServiceImpl service;

    @Test
    void testDependencyInjection() {
        assertNotNull(service.getDao());
    }

}
