package com.vod.api.controller;

import com.couchbase.client.java.Bucket;
import com.vod.dao.CacheService;
import com.vod.dao.TestService;
import com.vod.db.model.Token;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    private final CacheService cacheService;

    private final Bucket bucket;

    @GetMapping
    public Token test() {
        return testService.test();
    }

    @GetMapping("/bucket")
    public String getBucket() {
        return bucket.name();
    }

    @GetMapping("/cache")
    public long cache() {
        cacheService.simulateLongRun(3000);
        return System.currentTimeMillis();
    }


}
