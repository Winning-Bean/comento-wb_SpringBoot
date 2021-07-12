package com.comento.repository;

import com.comento.dto.CodeRequest;
import com.comento.vo.CodeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CodeRepository {
    public List<CodeVO> selectRepCode(CodeRequest request);

    public List<CodeVO> selectDetailCode(CodeRequest request);
}
