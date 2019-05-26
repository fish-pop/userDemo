package com.example.demo.model.PO.base;

import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {

    private int id;
    private Date createTime;
    private int craeteUserId;
    private Date updateTime;
    private int updateUserId;
    private int deleteFlag;

}
