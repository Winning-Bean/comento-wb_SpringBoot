package com.comento.controller;

import com.comento.dto.CodeRequest;
import com.comento.dto.CodeResponse;
import com.comento.dto.NoticeRequest;
import com.comento.dto.NoticeResponse;
import com.comento.service.CodeService;
import com.comento.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/code")
public class CodeController {
    @Autowired
    CodeService service;

    @RequestMapping("selectCode")
    @CrossOrigin
    public ResponseEntity<?> selectCode(@RequestBody CodeRequest reqeust) throws Exception {
        CodeResponse data = new CodeResponse();
        data.setList(service.selectRepCode(reqeust));
        return new ResponseEntity(data, HttpStatus.OK);
    }

    @RequestMapping("selectRepCode")
    @CrossOrigin
    public ResponseEntity<?> selectRepCode(@RequestBody CodeRequest reqeust) throws Exception {
        CodeResponse data = new CodeResponse();
        data.setList(service.selectDetailCode(reqeust));
        return new ResponseEntity(data, HttpStatus.OK);
    }
}
