package com.web;

import com.bean.Tongzhi;
import com.service.TongzhiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TongzhiController {

    @Autowired
    private TongzhiService tongzhiService;
}