package com.web;

import com.bean.Chapter;
import com.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ChapterController {

    @Autowired
    private ChapterService chapterService;
}