package com.comento.dto;

import java.util.List;

import com.comento.vo.NoticeVO;

import lombok.Data;

@Data
public class NoticeResponse {
	private List<NoticeVO> list;
	
	private int totalCnt;
	private int perPage;
	private int curPage;
}
