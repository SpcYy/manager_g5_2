package com.web;

import com.bean.Filemanage;
import com.service.FilemanageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FilemanageController {

    @Autowired
    private FilemanageService filemanageService;
}