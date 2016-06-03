package com.NewVillage.dao;

import com.NewVillage.entity.DesignFileCheck;

import java.util.List;

/**
 * Created by Dream on 2016/6/3.
 */

//设计文件审核
public interface DesignFileCheckDao {
    public List<DesignFileCheck> QueryAllDesignFileCheckMessage();
}
