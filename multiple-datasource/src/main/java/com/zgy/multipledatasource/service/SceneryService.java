package com.zgy.multipledatasource.service;

import com.zgy.multipledatasource.mapper.SceneryMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author renjiaxin
 * @Date 2020/10/20
 * @Description
 */
@Service
@Slf4j
public class SceneryService {
    @Autowired
    private SceneryMapper sceneryMapper;


}