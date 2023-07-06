package com.example.jwtv1.service;

import com.example.jwtv1.jwt.JwtUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Value("${jwt.secret}")
    private String secretKey;

    private Long expiredMs = 1000 * 60 * 60l;

    public String login(String username){
        return JwtUtil.createJwt(username, secretKey, expiredMs);
    }
}
