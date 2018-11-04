package com.web;

import com.bean.Role;
import com.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RoleController {

    @Autowired
    private RoleService roleService;

}