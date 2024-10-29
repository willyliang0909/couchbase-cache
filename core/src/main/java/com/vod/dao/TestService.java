package com.vod.dao;

import com.vod.db.model.Token;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public Token test() {
        var token = new Token();
        token.setName("www");
        return token;
    }
}
