package com.web;

import com.bean.Room;
import com.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RoomController {

    @Autowired
    private RoomService roomService;
}