package com.acat.dao;

import com.acat.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityDao extends JpaRepository<CityEntity,Integer> {

    @Query(value = "select city.bishe_city_name from bishe_city city inner join bishe_province province on city.bishe_city_provinceId=province.bishe_province_id and province.bishe_province_name=?1", nativeQuery = true)
    List<String> getCityListByProvince(String bishe_province_name);
}