package com.junbaobao.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MdcController {

    @GetMapping("mdc")
    public Object mdc() {
        return "";
    }
}
