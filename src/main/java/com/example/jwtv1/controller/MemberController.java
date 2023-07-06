package com.example.jwtv1.controller;

import com.example.jwtv1.dto.LoginDto;
import com.example.jwtv1.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

   @PostMapping("login")
   public ResponseEntity<String> login(@RequestBody LoginDto dto){
       return ResponseEntity.ok().body(memberService.login(dto.getUsername()));
   }
}
