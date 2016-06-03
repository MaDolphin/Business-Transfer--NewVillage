package com.NewVillage.action;

import com.NewVillage.dao.DesignFileCheckDao;
import com.NewVillage.entity.DesignFileCheck;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;
import java.util.Map;

/**
 * Created by Dream on 2016/6/3.
 */
public class DesignFileCheckAction extends ActionSupport {
    private Map session;
    private DesignFileCheckDao designFileCheckDao;

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }

    public DesignFileCheckDao getDesignFileCheckDao() {
        return designFileCheckDao;
    }

    public void setDesignFileCheckDao(DesignFileCheckDao designFileCheckDao) {
        this.designFileCheckDao = designFileCheckDao;
    }
    public String QueryAllDesignFileCheckMessage(){
        try{
            List<DesignFileCheck> designFileChecks=designFileCheckDao.QueryAllDesignFileCheckMessage();
            session.put("designFileChecks",designFileChecks);
        }catch (Exception ex){
            ex.printStackTrace();
            return INPUT;
        }
        return SUCCESS;
    }
}
