package com.web;

import com.bean.Menu;
import com.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MenuController {

    @Autowired
    private MenuService menuService;
}