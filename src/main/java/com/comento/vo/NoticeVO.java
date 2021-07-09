package com.comento.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("notice")
public class NoticeVO {
	private String seqNo;
	private String subject;
	private String ctnt;
	private String statCd;
	private String viewCnt;
}
