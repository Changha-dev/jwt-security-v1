package com.example.jwtv1.controller;

import com.example.jwtv1.dto.MemberSignInResquestDto;
import com.example.jwtv1.dto.MemberSignUpRequestDto;
import com.example.jwtv1.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

   @PostMapping("/login")
   public ResponseEntity<String> login(@RequestBody MemberSignInResquestDto request) throws Exception {
           return ResponseEntity.ok().body(memberService.signIn(request));
   }

   @PostMapping("/join")
   @ResponseStatus(HttpStatus.OK)
    public Long join(@Valid @RequestBody MemberSignUpRequestDto request) throws Exception {
       return memberService.signUp(request);
   }


}
