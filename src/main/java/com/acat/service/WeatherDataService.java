package com.acat.service;

import com.acat.entity.WeatherVo.WeatherResponse;

public interface WeatherDataService {

    /**
     *
     * @param cityName
     * @return
     */
    WeatherResponse getDataByCityName(String cityName);

}
