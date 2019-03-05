package com.acat.controller;


import com.acat.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    private static final Logger logger = LoggerFactory.getLogger(CityController.class);

    @Autowired
    private CityService cityService;

    @GetMapping("/getCityList/{bishe_province_name}")
    public List<String> getCityList(@PathVariable("bishe_province_name") String bishe_province_name){

        System.out.println("------------------");
        System.out.println(bishe_province_name);
        System.out.println("------------------");

        List<String> list = cityService.getCityList(bishe_province_name);

        System.out.println("***********");
        System.out.println(list);
        System.out.println("***********");
        return list;
    }
}
