package com.NewVillage.dao;

import com.NewVillage.entity.DesignFileCheck;
import com.NewVillage.entity.Inspect;
import com.NewVillage.entity.Inspection;

import java.util.List;

/**
 * Created by xfcq on 2016/6/3.
 */
public interface CheckDao {
    public void addCheck(Inspect inspect);
    public void updateObject(Object object);
    public List<DesignFileCheck> searchObject(String id);
    public List<Inspect> searchInspect(int id);
    public List<Inspection> searchInspection(int id);
    public List<Inspect> searchInspectManage(int id);
    public List<Inspection> searchInspectionManage(int id);

    }
