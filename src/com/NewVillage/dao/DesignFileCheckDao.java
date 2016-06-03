package com.NewVillage.dao;

import com.NewVillage.entity.DesignFileCheck;

import java.util.List;

/**
 * Created by Dream on 2016/6/3.
 */

//设计文件审核Dao
public interface DesignFileCheckDao {
    public List<DesignFileCheck> QueryAllDesignFileCheckMessage();
    public void addDesignFileCheckRecord(DesignFileCheck designFileCheck);
    public boolean deleteDesignFileCheckRecord(DesignFileCheck designFileCheck);
    public DesignFileCheck queryDesignFileCheckRecordByID(int recordId);
    public boolean existDesignFileCheckRecordById(int recordId);
    public boolean updateDesignFileCheckRecord(DesignFileCheck designFileCheck);
}
