package com.NewVillage.action;

import com.NewVillage.dao.PowerDesignDao;
import com.NewVillage.entity.Employee;
import com.NewVillage.entity.PowerDesign;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.List;
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

    public String InitPowerDesignShow(){
        Employee employee = (Employee) session.get("employee");
        List<PowerDesign> powerDesignList = powerDesignDao.allPowerDesignsByEmpID(employee.getEmpId());
        session.put("PowerDesignList",powerDesignList);
        return SUCCESS;
    }

    public String InitPowerDesignAdd(){
        Employee employee = (Employee) session.get("employee");
        List<PowerDesign>  powerDesignListByEmpID = powerDesignDao.allPowerDesignsByEmpIDStatus0(employee.getEmpId());
        session.put("PowerDesignListByEmpID",powerDesignListByEmpID);
        return SUCCESS;
    }

    public String AddPowerDesign(){
        //add PowerDesign
        PowerDesign power1 = powerDesignDao.allPowerDesignsByNewIDStatus0(this.powerDesign.getNewId());
        power1.setStatus("1");
        power1.setPowerQuality(this.powerDesign.getPowerQuality());
        power1.setPowerType(this.powerDesign.getPowerType());
        power1.setPowerSupplyMode(this.powerDesign.getPowerSupplyMode());
        power1.setPowerVoltage(this.powerDesign.getPowerVoltage());
        power1.setPowerCapacity(this.powerDesign.getPowerCapacity());
        power1.setPowerNum(this.powerDesign.getPowerNum());
        power1.setPowerLineNum(this.powerDesign.getPowerLineNum());
        power1.setPowerStation(this.powerDesign.getPowerStation());
        if(powerDesignDao.updatePowerDesign(power1)){


            return "addPowerDesignSuccess";
        }else {
            return "addPowerDesignError";
        }
    }

}
