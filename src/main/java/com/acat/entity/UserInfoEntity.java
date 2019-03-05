package com.acat.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@ToString
@Setter
@Getter
@Entity
@Table(name = "bishe_userInfo")
public class UserInfoEntity implements Serializable {

    private static final long serialVersionUID = 2L;

    /**
     * bishe_userInfo_id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bishe_userInfo_id;

    /**
     * 用户昵称
     */
    private String bishe_userInfo_nike;

    /**
     * 用户性别
     */
    private String bishe_userInfo_sex;

    /**
     * 用户email
     */
    private String bishe_userInfo_email;

    /**
     * 用户上传的图像
     */
    private String bishe_userInfo_image;

    /**
     * 上传信息的所属人的id',
     */
    private Integer bishe_userInfo_registerId;
}
