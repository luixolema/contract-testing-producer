package com.example.producer;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.web.context.WebApplicationContext;

/**
 * $Id$
 * <p>
 * Created 21/01/2022 by maciasavila
 * </p>
 * <p>
 * [Add comment here]
 * </p>
 * <p>
 * Copyright: Copyright (c) 2020
 * Organisation: Igel Technology GmbH
 * </p>
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@DirtiesContext
public class ContractTestsBaseClass
{

    @Autowired
    WebApplicationContext webApplicationContext;

    @BeforeEach
    public void setup(){
        RestAssuredMockMvc.webAppContextSetup(webApplicationContext);
    }
}
