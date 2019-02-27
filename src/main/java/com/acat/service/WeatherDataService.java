package com.acat.service;

import com.acat.vo.WeatherResponse;


public interface WeatherDataService {

    /**
     *
     * @param cityId
     * @return
     */
    WeatherResponse getDataByCityId(String cityId);

    /**
     * @param cityName
     * @return
     */
    WeatherResponse getDataByCityName(String cityName);
}
