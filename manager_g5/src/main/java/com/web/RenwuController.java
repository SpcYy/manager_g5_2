package com.web;

import com.bean.Renwu;
import com.service.RenwuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RenwuController {

    @Autowired
    private RenwuService renwuService;
}