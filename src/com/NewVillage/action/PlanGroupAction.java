package com.NewVillage.action;

import com.NewVillage.dao.InvestigationSiteDao;
import com.NewVillage.dao.MessageDao;
import com.NewVillage.dao.PowerDesignDao;
import com.NewVillage.dao.ProcessRecordDao;
import com.NewVillage.entity.*;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.sql.Timestamp;
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
    private InvestigationSiteDao investigationSiteDao;
    private Map session;
    private int messId;
    private Integer empId;
    private Integer newId;
    private Integer powerId;

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    public int getMessId() {
        return messId;
    }

    public void setMessId(int messId) {
        this.messId = messId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getNewId() {
        return newId;
    }

    public void setNewId(Integer newId) {
        this.newId = newId;
    }

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }

    public void setInvestigationSiteDao(InvestigationSiteDao investigationSiteDao) {
        this.investigationSiteDao = investigationSiteDao;
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

    public String InitPowerDesignDetail(){
        PowerDesign powerDesigns= powerDesignDao.queryPowerDesignByID(powerId);
        session.put("PowerDesignInfo",powerDesigns);
        return SUCCESS;
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
            //edit PowerDesign id to ProcessRecord
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
        List<Message> messageList = messageDao.allMessageByEmpID(employee.getEmpId());
        session.put("PlanGroupMessageList",messageList);
        return SUCCESS;
    }

    public String AcceptMessage(){
        Message message = messageDao.queryMessageByID(messId);
        message.setStatus("1");
        messageDao.updateMessage(message);

//        //edit PowerDesign status to -1
        PowerDesign power1 = powerDesignDao.allPowerDesignsByNewIDStatusOff(newId);
//        power1.setStatus("-1");
//        powerDesignDao.updatePowerDesign(power1);

        //add PowerDesign
        PowerDesign newPower = new PowerDesign();
        newPower.setNewId(power1.getNewId());
        Timestamp date = new Timestamp(System.currentTimeMillis());
        newPower.setCreateTime(date);
        newPower.setPowerDesignPerId(power1.getPowerDesignPerId());
        newPower.setStatus("0");
        powerDesignDao.addPowerDesign(newPower);

        //add PowerDesign id to InvestigationSite
        PowerDesign powerDesign1 = powerDesignDao.queryPowerDesignByNewID(power1.getNewId());
        InvestigationSite investigationSite2 = investigationSiteDao.queryInvestigationSiteByNewIDStatus0(power1.getNewId());
        investigationSite2.setPowerId(powerDesign1.getPowerId());
        investigationSiteDao.updateInvestigationSite(investigationSite2);

        return "acceptMessageSuccess";
    }

}
