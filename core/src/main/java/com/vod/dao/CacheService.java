package com.vod.dao;

import com.couchbase.client.java.Bucket;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Getter
@Service
@RequiredArgsConstructor
public class CacheService {

    private final Bucket bucket;

    @Cacheable(value="persistent", key="'longrunsim-'+#time")
    public String simulateLongRun(long time) {
        try {
            Thread.sleep(time);
        } catch(Exception ex) {
            System.out.println("This shouldnt happen...");
        }
        return "I've slept " + time + " miliseconds.";
    }
}
