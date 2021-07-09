package com.comento.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.comento.dto.NoticeRequest;
import com.comento.repository.NoticeRepository;
import com.comento.vo.NoticeVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class NoticeService {
	private static final Logger LOGGER = LoggerFactory.getLogger(NoticeService.class);

	@Autowired
	NoticeRepository repository;

	public List<NoticeVO> selectTest(NoticeRequest reqeust){
		return repository.selectTest(reqeust);
	}
}