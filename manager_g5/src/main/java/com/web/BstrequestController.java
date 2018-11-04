package com.web;

import com.bean.Bstrequest;
import com.service.BstrequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BstrequestController {

    @Autowired
    private BstrequestService bstrequestService;
}