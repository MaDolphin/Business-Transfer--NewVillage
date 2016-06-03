package com.NewVillage.action;

import com.NewVillage.dao.InvestigationSiteDao;
import com.NewVillage.dao.InvestigationWorkDao;
import com.NewVillage.entity.InvestigationSite;
import com.NewVillage.entity.InvestigationWork;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by xfcq on 2016/6/3.
 */
public class InvestigatorAction extends ActionSupport implements SessionAware {
    InvestigationSiteDao investigationSiteDao;
    InvestigationWorkDao investigationWorkDao;
    InvestigationWork investigationWork;
    InvestigationSite investigationSite;
    private Map session;

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }

    public InvestigationWork getInvestigationWork() {
        return investigationWork;
    }

    public void setInvestigationWork(InvestigationWork investigationWork) {
        this.investigationWork = investigationWork;
    }

    public InvestigationSite getInvestigationSite() {
        return investigationSite;
    }

    public void setInvestigationSite(InvestigationSite investigationSite) {
        this.investigationSite = investigationSite;
    }

    public void setInvestigationSiteDao(InvestigationSiteDao investigationSiteDao) {
        this.investigationSiteDao = investigationSiteDao;
    }

    public void setInvestigationWorkDao(InvestigationWorkDao investigationWorkDao) {
        this.investigationWorkDao = investigationWorkDao;
    }
}
