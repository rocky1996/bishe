package com.acat.service;

import com.acat.entity.AddressVo.AddressResponse;

public interface AddressDataService {

    /**
     *
     * @param ip
     * @return
     */
    AddressResponse getAddressByIp(String ip);

}
