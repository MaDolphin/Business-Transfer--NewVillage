package com.NewVillage.action;

import com.NewVillage.dao.PowerDesignDao;
import com.NewVillage.entity.PowerDesign;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by xfcq on 2016/6/3.
 */
public class PlanGroupAction extends ActionSupport implements SessionAware {
    PowerDesignDao powerDesignDao;
    PowerDesign powerDesign;
    private Map session;

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }

    public void setPowerDesignDao(PowerDesignDao powerDesignDao) {
        this.powerDesignDao = powerDesignDao;
    }

    public PowerDesign getPowerDesign() {
        return powerDesign;
    }

    public void setPowerDesign(PowerDesign powerDesign) {
        this.powerDesign = powerDesign;
    }

    public String PowerDesignDetail(){
        try{
            PowerDesign powerDesigns= powerDesignDao.queryPowerDesignByID(powerDesign.getPowerId());
            session.put("PowerDesignInfo",powerDesigns);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return "PowerDesignDetail";
    }

}
