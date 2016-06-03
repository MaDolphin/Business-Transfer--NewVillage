package com.NewVillage.dao;

import com.NewVillage.entity.InvestigationWork;

import java.util.List;

/**
 * Created by xfcq on 2016/6/3.
 */
public interface InvestigationWorkDao {
    public boolean addInvestigationWork(InvestigationWork investigationWork);
    public InvestigationWork queryInvestigationWorkByID(int investid);
    public InvestigationWork queryInvestigationWorkByNewID(int newid);
    public boolean deleteInvestigationWork(InvestigationWork investigationWork);
    public boolean updateInvestigationWork(InvestigationWork investigationWork);
    public List<InvestigationWork> allInvestigationWorksByEmpID(int empid);
    public List<InvestigationWork> allInvestigationWorksByNewID(int newid);
}
