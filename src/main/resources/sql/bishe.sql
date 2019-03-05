drop database if exists bishe;
create database bishe;

use bishe;

#登录注册表
drop table if exists bishe_register;
create table `bishe_register`(
    `bishe_register_id` int(10) not null auto_increment,
    `bishe_register_username` varchar(20) not null COMMENT '用户名',
    `bishe_register_password` varchar(35) not null COMMENT '用户密码',
    `bishe_register_flag` int(2) not null COMMENT '是一个判断的标志，判断是管理员还是普通的用户',
    primary key (`bishe_register_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


#用户完善信息表
drop table if exists bishe_userInfo;
create table `bishe_userInfo`(
    `bishe_userInfo_id` int(10) not null auto_increment,
    `bishe_userInfo_nike` varchar(20) not null COMMENT '用户昵称',
    `bishe_userInfo_sex` varchar(2) not null COMMENT '用户性别',
    `bishe_userInfo_email` varchar(20) not null COMMENT '用户email',
    `bishe_userInfo_image` varchar(30) not null COMMENT '用户上传图像',
    `bishe_userInfo_registerId` int(10) not null COMMENT '上传信息的所属人id',
    primary key (`bishe_userInfo_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


#发布旅游信息的表
drop table if exists bishe_tour;
create table `bishe_tour`(
    `bishe_tour_id` int(10) not null auto_increment,
    `bishe_tour_name` varchar(20) not null COMMENT '发布的旅游信息的名称',
    `bishe_tour_provinceName` varchar(10) not null COMMENT '发布的旅游信息的省份,此处是一个下拉列表',
    `bishe_tour_cityName` varchar(15) not null COMMENT '发布的旅游信息的市区,此处是一个下拉列表',
    `bishe_tour_image` varchar(30) not null COMMENT '发布的旅游信息的照片',
    `bishe_tour_desc` text not null COMMENT '发布的旅游信息的简介',
    `bishe_tour_time` varchar(15) not null COMMENT '发布的旅游的时间',
    `bishe_tour_registerId` int(10) not null COMMENT '发布的旅游的人的id',
    primary key (`bishe_tour_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


#省级单位表
drop table if exists bishe_province;
create table `bishe_province`(
    `bishe_province_id` int(10) not null auto_increment,
    `bishe_province_name` varchar(10) not null COMMENT '省级名称',
    primary key (`bishe_province_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


#市级单位表
drop table if exists bishe_city;
create table `bishe_city`(
    `bishe_city_id` int(10) not null auto_increment,
    `bishe_city_name` varchar(10) not null COMMENT '市级名称',
    `bishe_city_provinceId` int(10) not null COMMENT '市级对应省份',
    primary key (`bishe_city_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

#用户收藏表
drop table if exists bishe_collect;
create table `bishe_collect`(
    `bishe_collect_id` int(10) not null auto_increment,
    `bishe_collect_registerId` int(10) not null COMMENT '',
    primary key (`bishe_collect_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;