package com.acat.controller;

import com.acat.service.AreaMapService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/map")
public class AreaMapController {

    private static final Logger logger = LoggerFactory.getLogger(AreaMapController.class);

    @Autowired
    private AreaMapService areaMapService;

    @GetMapping("/getMapURL/{address}")
    public String getMapURL(String address){
        return areaMapService.getAreaMapUrl(address);
    }
}
