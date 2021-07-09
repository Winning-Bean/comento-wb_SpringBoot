package com.comento.dto;

import lombok.Data;

@Data
public class NoticeRequest {
	private String title;
	private String statCd;
	
	@Data
	public static class detail {
		private String seqNo;
	}
}
