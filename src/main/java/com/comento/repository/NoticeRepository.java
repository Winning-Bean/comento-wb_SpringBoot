package com.comento.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.comento.dto.NoticeRequest;
import com.comento.vo.NoticeVO;

@Mapper
public interface NoticeRepository {
	public List<NoticeVO> selectTest(NoticeRequest request);
}