package com.NewVillage.dao;

import com.NewVillage.entity.NewVillage;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by xfcq on 2016/6/3.
 */
public interface NewVillageDao {
    public boolean addNewVillage(NewVillage newVillage);
    public NewVillage queryNewVillageByID(int newid);
    public NewVillage queryNewVillageByUserTime(String userpid,int empid,Timestamp time);
    public boolean deleteNewVillage(NewVillage newVillage);
    public boolean updateNewVillage(NewVillage newVillage);
    public List<NewVillage> allNewVillagesByEmpID(int empid);
    List<NewVillage> queryAllNewVillage();
}
