package com.comento.vo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("code")
public class CodeVO {
    private String commCdId;
    private String commCdNm;
    private String commCdEng;

    private String cdId;
    private String cdNm;
    private String cdEng;

    private int cdSort;
    private char cdUseYn;
    private String conn1Cd;
    private String conn2Cd;
    private String conn3Cd;
}
