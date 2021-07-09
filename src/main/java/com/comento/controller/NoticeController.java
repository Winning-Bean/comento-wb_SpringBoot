package com.comento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comento.dto.NoticeRequest;
import com.comento.dto.NoticeResponse;
import com.comento.service.NoticeService;

@RestController
@RequestMapping("/notice")
public class NoticeController {
	
	@Autowired
	NoticeService service;
	
	@RequestMapping("selectNotice")
	@CrossOrigin
	public ResponseEntity<?> selectTest(@RequestBody NoticeRequest reqeust) throws Exception {
		NoticeResponse data = new NoticeResponse();
		data.setList(service.selectTest(reqeust));
		return new ResponseEntity(data, HttpStatus.OK);
	}
}
