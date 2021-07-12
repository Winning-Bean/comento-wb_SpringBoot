package com.comento.vo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("code")
public class CodeVO {
    private String repCode;
    private String detailCode;
}
