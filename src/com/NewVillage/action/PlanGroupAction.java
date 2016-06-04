package com.NewVillage.action;

import com.NewVillage.dao.MessageDao;
import com.NewVillage.dao.PowerDesignDao;
import com.NewVillage.dao.ProcessRecordDao;
import com.NewVillage.entity.Employee;
import com.NewVillage.entity.Message;
import com.NewVillage.entity.PowerDesign;
import com.NewVillage.entity.ProcessRecord;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.List;
import java.util.Map;

/**
 * Created by xfcq on 2016/6/3.
 */
public class PlanGroupAction extends ActionSupport implements SessionAware {
    private MessageDao messageDao;
    private ProcessRecordDao processRecordDao;
    private PowerDesignDao powerDesignDao;
    private PowerDesign powerDesign;
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

    public void setProcessRecordDao(ProcessRecordDao processRecordDao) {
        this.processRecordDao = processRecordDao;
    }

    public void setMessageDao(MessageDao messageDao) {
        this.messageDao = messageDao;
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
            ProcessRecord processRecord = processRecordDao.queryProcessRecordByNewVillage(power1.getNewId());
            processRecord.setStatus("制定电源方案");
            processRecord.setPowerId(power1.getPowerId());
            processRecordDao.editProcess(processRecord);
            return "addPowerDesignSuccess";
        }else {
            return "addPowerDesignError";
        }
    }

    public String InitMessageShow(){
        Employee employee = (Employee) session.get("employee");
        List<Message> messageList = messageDao.allMessageByEmpIDStatus0(employee.getEmpId());
        session.put("PlanGroupMessageList",messageList);
        return SUCCESS;
    }

}
