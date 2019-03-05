package com.acat.service.impl;

import com.acat.dao.CityDao;
import com.acat.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("cityService")
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    public List<String> getCityList(String bishe_province_name){

        List<String> list = new ArrayList<>();

        if(bishe_province_name.length()!=0){
            list = cityDao.getCityListByProvince(bishe_province_name);
        }
        return list;
    }
}
