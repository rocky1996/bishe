package com.acat.service;

import com.acat.entity.RegisterEntity;

public interface RegisterService {

    void addRegister(RegisterEntity registerEntity);

    RegisterEntity login(String bishe_register_username,String bishe_register_password);

}
