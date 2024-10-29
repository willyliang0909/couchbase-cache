package com.vod.api.controller;

import com.vod.dao.TestService;
import com.vod.db.model.Token;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping
    public Token test() {
        return testService.test();
    }
}
