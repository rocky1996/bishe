package com.acat.controller;

import com.acat.entity.AddressVo.AddressResponse;
import com.acat.service.AddressDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    private static final Logger logger = LoggerFactory.getLogger(AddressController.class);

    @Autowired
    private AddressDataService addressDataService;

    @GetMapping("/getAddress/{ip}")
    public AddressResponse getAddress(@PathVariable("ip") String ip){
        return addressDataService.getAddressByIp(ip);
    }

}
