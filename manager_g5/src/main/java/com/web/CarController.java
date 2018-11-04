package com.web;

import com.bean.Car;
import com.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarController {

    @Autowired
    private CarService carService;
}