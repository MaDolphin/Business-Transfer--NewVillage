package com.NewVillage.dao;

import com.NewVillage.entity.ProcessRecord;

import java.util.List;

/**
 * Created by 珏 on 2016/6/3.
 */
public interface ProcessRecordDao {
    public List<ProcessRecord> QueryAllProcess();
    public List<ProcessRecord> QueryProcess(String hql);
    public void addProcess(ProcessRecord processRecord);
    public void editProcess(ProcessRecord processRecord);
    public ProcessRecord queryProcessRecordByNewVillage(int newid);
}
