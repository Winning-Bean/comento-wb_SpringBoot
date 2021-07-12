package com.comento.service;

import com.comento.dto.CodeRequest;
import com.comento.dto.NoticeRequest;
import com.comento.repository.CodeRepository;
import com.comento.repository.NoticeRepository;
import com.comento.vo.CodeVO;
import com.comento.vo.NoticeVO;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class CodeService {
    private static final Logger LOGGER = LoggerFactory.getLogger(NoticeService.class);

    @Autowired
    CodeRepository repository;

    public List<CodeVO> selectRepCode(CodeRequest reqeust){
        return repository.selectRepCode(reqeust);
    }

    public List<CodeVO> selectDetailCode(CodeRequest reqeust){
        return repository.selectDetailCode(reqeust);
    }
}
