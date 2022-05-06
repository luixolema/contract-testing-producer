package com.example.producer;


import com.example.producer.dto.ExampleRequest;
import com.example.producer.dto.ExampleResponse;
import com.example.producer.dto.ResponseStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
public class ExampleController
{

    @PostMapping("/test")
    public ResponseEntity<ExampleResponse> test(@RequestBody ExampleRequest request)
    {
//        TODO: the contract are not used to test business logic, so it's not necessary to test every possible entry of the endpoints.
//        TODO: in this case we don't need to create a contract for every case for a NO_OK response.
        if (request.getId() > 1 || request.getData().equals("wrong_data"))
        {
            return ResponseEntity.badRequest().body(new ExampleResponse("it works", ResponseStatus.NO_OK));
        }

        return ResponseEntity.ok(new ExampleResponse("it works", ResponseStatus.OK));
    }



}
