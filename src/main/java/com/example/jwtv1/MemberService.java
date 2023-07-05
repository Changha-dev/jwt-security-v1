package com.example.jwtv1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Value("${jwt.secret}")
    private String secretKey;

    private Long expiredMs = 1000 * 60 * 60l;

    public String login(String username, String password){
        return JwtUtil.createJwt(username, secretKey, expiredMs);
    }
}
