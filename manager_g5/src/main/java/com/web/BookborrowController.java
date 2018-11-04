package com.web;

import com.bean.Bookborrow;
import com.service.BookborrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookborrowController {

    @Autowired
    private BookborrowService bookborrowService;
}