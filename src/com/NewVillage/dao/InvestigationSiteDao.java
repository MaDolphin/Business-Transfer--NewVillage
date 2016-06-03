package com.NewVillage.dao;

import com.NewVillage.entity.InvestigationSite;

import java.util.List;

/**
 * Created by xfcq on 2016/6/3.
 */
public interface InvestigationSiteDao {
    public boolean addInvestigationSite(InvestigationSite investigationSite);
    public InvestigationSite queryInvestigationSiteByID(int invesSiteId);
    public InvestigationSite queryInvestigationSiteByNewID(int newid);
    public boolean deleteInvestigationSite(InvestigationSite investigationSite);
    public boolean updateInvestigationSite(InvestigationSite investigationSite);
    public List<InvestigationSite> allInvestigationWorksByEmpID(int empid);
    public List<InvestigationSite> allInvestigationWorksByNewID(int newid);
}
