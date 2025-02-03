package com.ephi.v1.ephi.rest;

import com.ephi.v1.ephi.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin(origins = "*")
@RequestMapping(path = "/member")
@RestController
public class MemberRest {

    @Autowired
    MemberService memberService;

    @GetMapping(path = "/{mId}")
    ResponseEntity<String> getMember(@PathVariable(name = "mId") String mId) {
        log.info("call here");
        return new ResponseEntity<>(memberService.getMember(mId), HttpStatus.OK);
    }

}
