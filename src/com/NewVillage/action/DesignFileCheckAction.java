package com.NewVillage.action;

import com.NewVillage.dao.DesignFileCheckDao;
import com.NewVillage.entity.DesignFileCheck;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

/**
 * Created by Dream on 2016/6/3.
 */
public class DesignFileCheckAction extends ActionSupport implements SessionAware {
    private Map session;
    private DesignFileCheckDao designFileCheckDao;
    private int designFileId;
    private String designUnit;
    private String designLevel;
    private String submittedUnit;
    private Timestamp submittedTime;
    private int accPerId;
    private int checkPerId;
    private Timestamp checkTime;
    private int civilDrawingNum;
    private int lineDrawingNum;
    private int eleDrawingNum;
    private String checkOpinion;
    private int registerPerId;
    private Timestamp registerTime;
    private Timestamp createTime;
    private int newId;
    private String status;
    private String result;
    public int getDesignFileId() {
        return designFileId;
    }

    public void setDesignFileId(int designFileId) {
        this.designFileId = designFileId;
    }

    public String getDesignUnit() {
        return designUnit;
    }

    public void setDesignUnit(String designUnit) {
        this.designUnit = designUnit;
    }

    public String getDesignLevel() {
        return designLevel;
    }

    public void setDesignLevel(String designLevel) {
        this.designLevel = designLevel;
    }

    public String getSubmittedUnit() {
        return submittedUnit;
    }

    public void setSubmittedUnit(String submittedUnit) {
        this.submittedUnit = submittedUnit;
    }

    public Timestamp getSubmittedTime() {
        return submittedTime;
    }

    public void setSubmittedTime(Timestamp submittedTime) {
        this.submittedTime = submittedTime;
    }

    public int getAccPerId() {
        return accPerId;
    }

    public void setAccPerId(int accPerId) {
        this.accPerId = accPerId;
    }

    public int getCheckPerId() {
        return checkPerId;
    }

    public void setCheckPerId(int checkPerId) {
        this.checkPerId = checkPerId;
    }

    public Timestamp getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Timestamp checkTime) {
        this.checkTime = checkTime;
    }

    public int getCivilDrawingNum() {
        return civilDrawingNum;
    }

    public void setCivilDrawingNum(int civilDrawingNum) {
        this.civilDrawingNum = civilDrawingNum;
    }

    public int getLineDrawingNum() {
        return lineDrawingNum;
    }

    public void setLineDrawingNum(int lineDrawingNum) {
        this.lineDrawingNum = lineDrawingNum;
    }

    public int getEleDrawingNum() {
        return eleDrawingNum;
    }

    public void setEleDrawingNum(int eleDrawingNum) {
        this.eleDrawingNum = eleDrawingNum;
    }

    public String getCheckOpinion() {
        return checkOpinion;
    }

    public void setCheckOpinion(String checkOpinion) {
        this.checkOpinion = checkOpinion;
    }

    public int getRegisterPerId() {
        return registerPerId;
    }

    public void setRegisterPerId(int registerPerId) {
        this.registerPerId = registerPerId;
    }

    public Timestamp getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public int getNewId() {
        return newId;
    }

    public void setNewId(int newId) {
        this.newId = newId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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
            this.session.put("designFileChecks",designFileChecks);
        }catch (Exception ex){
            ex.printStackTrace();
            return INPUT;
        }
        return SUCCESS;
    }
    public String addDesignFileCheckRecord(){
        try {
            DesignFileCheck designFileCheck = new DesignFileCheck();
            Timestamp date=new Timestamp(System.currentTimeMillis());
            if (designFileCheckDao.queryDesignFileCheckRecordByID(designFileId) == null) {
                designFileCheck.setAccPerId(designFileId);
                designFileCheck.setDesignUnit(designUnit);
                designFileCheck.setDesignLevel(designLevel);
                designFileCheck.setSubmittedUnit(submittedUnit);
                designFileCheck.setSubmittedTime(submittedTime);
                designFileCheck.setAccPerId(accPerId);
                designFileCheck.setCheckPerId(checkPerId);
                designFileCheck.setCheckTime(checkTime);
                designFileCheck.setCivilDrawingNum(civilDrawingNum);
                designFileCheck.setLineDrawingNum(lineDrawingNum);
                designFileCheck.setEleDrawingNum(eleDrawingNum);
                designFileCheck.setCheckOpinion(checkOpinion);
                designFileCheck.setRegisterPerId(registerPerId);
                designFileCheck.setRegisterTime(registerTime);
                designFileCheck.setCreateTime(date);
                designFileCheckDao.addDesignFileCheckRecord(designFileCheck);
            }
        }catch (Exception ex) {
            ex.printStackTrace();
            return INPUT;
        }
        return result="addSuccess";
    }
    public String deleteDesignFileCheckRecord(){
        DesignFileCheck designFileCheck=designFileCheckDao.queryDesignFileCheckRecordByID(designFileId);
        if(designFileCheckDao.deleteDesignFileCheckRecord(designFileCheck)){
            return SUCCESS;
        }else{
            return INPUT;
        }
    }

    public String updateDesignFileCheckRecord(){
        DesignFileCheck designFileCheck=designFileCheckDao.queryDesignFileCheckRecordByID(designFileId);
        designFileCheck.setAccPerId(designFileId);
        designFileCheck.setDesignUnit(designUnit);
        designFileCheck.setDesignLevel(designLevel);
        designFileCheck.setSubmittedUnit(submittedUnit);
        designFileCheck.setSubmittedTime(submittedTime);
        designFileCheck.setAccPerId(accPerId);
        designFileCheck.setCheckPerId(checkPerId);
        designFileCheck.setCheckTime(checkTime);
        designFileCheck.setCivilDrawingNum(civilDrawingNum);
        designFileCheck.setLineDrawingNum(lineDrawingNum);
        designFileCheck.setEleDrawingNum(eleDrawingNum);
        designFileCheck.setCheckOpinion(checkOpinion);
        designFileCheck.setRegisterPerId(registerPerId);
        designFileCheck.setRegisterTime(registerTime);
        if (designFileCheckDao.updateDesignFileCheckRecord(designFileCheck)){
            return SUCCESS;
        }else {
            return INPUT;
        }
    }

    public String queryDesignFileCheckRecordByID(){
        try{
            DesignFileCheck designFileCheck=designFileCheckDao.queryDesignFileCheckRecordByID(designFileId);
            session.put("designFileCheck",designFileCheck);
        }catch (Exception ex){
            ex.printStackTrace();
            return INPUT;
        }
        return SUCCESS;
    }
}
