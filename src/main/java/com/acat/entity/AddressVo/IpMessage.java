package com.acat.entity.AddressVo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Setter
@Getter
public class IpMessage implements Serializable {

    private static final long serialVersionUID = 2L;

    private String ip;
    private String address;

}
