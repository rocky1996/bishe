package com.acat.vo;

import java.io.Serializable;

public class ProvinceNameVo implements Serializable {

    private static final long serialVersionUID = 2L;

    private String bishe_province_name;

    public String getBishe_province_name() {
        return bishe_province_name;
    }

    public void setBishe_province_name(String bishe_province_name) {
        this.bishe_province_name = bishe_province_name;
    }

    @Override
    public String toString() {
        return "ProvinceNameVo{" +
                "bishe_province_name='" + bishe_province_name + '\'' +
                '}';
    }
}