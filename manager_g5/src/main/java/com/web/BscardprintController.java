package com.web;

import com.bean.Bscardprint;
import com.service.BscardprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BscardprintController {

    @Autowired
    private BscardprintService bscardprintService;
}