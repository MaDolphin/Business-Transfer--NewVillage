package com.NewVillage.action;

import com.NewVillage.dao.*;
import com.NewVillage.entity.*;
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
    private PowerDesignDao powerDesignDao;
    private ExaminationDao examinationDao;
    private MessageDao messageDao;
    private ProcessRecordDao processRecordDao;
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
    private int newId,powerDesignId;
    private String status;
    private String result;
    private Examination examination;

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

    public int getPowerDesignId() {
        return powerDesignId;
    }

    public void setPowerDesignId(int powerDesignId) {
        this.powerDesignId = powerDesignId;
    }

    public void setPowerDesignDao(PowerDesignDao powerDesignDao) {
        this.powerDesignDao = powerDesignDao;
    }

    public void setDesignFileCheckDao(DesignFileCheckDao designFileCheckDao) {
        this.designFileCheckDao = designFileCheckDao;
    }

    public Examination getExamination() {
        return examination;
    }

    public void setExamination(Examination examination) {
        this.examination = examination;
    }

    public void setExaminationDao(ExaminationDao examinationDao) {
        this.examinationDao = examinationDao;
    }

    public void setMessageDao(MessageDao messageDao) {
        this.messageDao = messageDao;
    }

    public void setProcessRecordDao(ProcessRecordDao processRecordDao) {
        this.processRecordDao = processRecordDao;
    }

    public String QueryAllDesignFileCheckMessage(){
        try{
            List<DesignFileCheck> designFileChecks=designFileCheckDao.QueryAllDesignFileCheckMessage();
            this.session.put("designFileChecks",designFileChecks);
        }catch (Exception ex){
            ex.printStackTrace();
            return INPUT;
        }
        return result="queryAllSuccess";
    }
    public String addDesignFileCheckRecord(){
        try {
            DesignFileCheck designFileCheck = new DesignFileCheck();
            System.out.println(designFileId);
            Timestamp date=new Timestamp(System.currentTimeMillis());
            if (designFileCheckDao.queryDesignFileCheckRecordByID(designFileId) == null) {
                designFileCheck.setDesignFileId(designFileId);
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
        designFileCheck.setNewId(newId);
        designFileCheck.setStatus(status);
        System.out.println(status);
        if (designFileCheckDao.updateDesignFileCheckRecord(designFileCheck)){
            return result="updateSuccess";
        }else {
            return INPUT;
        }
    }

    public String queryDesignFileCheckRecordByID(){
        try{
            System.out.println(designFileId);
            DesignFileCheck designFileCheck=designFileCheckDao.queryDesignFileCheckRecordByID(designFileId);
            System.out.println(designFileCheck);
            session.put("designFileCheck",designFileCheck);
        }catch (Exception ex){
            ex.printStackTrace();
            return INPUT;
        }
        return result="querySuccess";
    }

    public String queryDesignFileCheckRecordByIDAfterUpdate(){
        try{
            DesignFileCheck dfCheck= (DesignFileCheck)session.get("designFileCheck");
            DesignFileCheck designFileCheck=designFileCheckDao.queryDesignFileCheckRecordByID(dfCheck.getDesignFileId());
            session.put("designFileCheck",designFileCheck);
        }catch (Exception ex){
            ex.printStackTrace();
            return INPUT;
        }
        return result="querySuccess";
    }

    //查询所有未审批电源方案
    public String QueryPowerDesign(){
        try{
            List<PowerDesign> powerDesigns= powerDesignDao.allPowerDesigns();
            session.put("PowerDesignList",powerDesigns);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return "PowerDesign";
    }

/*    public String QueryPowerDesignByID(){
        try{
            PowerDesign powerDesign= powerDesignDao.queryPowerDesignByID(powerDesignId);
            session.put("PowerDesignInfo",powerDesign);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return "Examination";
    }*/

    public String addExamination(){
        String flag=INPUT;
        Timestamp time=new Timestamp(System.currentTimeMillis());
        try{
            Employee employee=(Employee)session.get("Employee");
            PowerDesign powerDesign=(PowerDesign)session.get("PowerDesignInfo");
            examination.setExPerId(String.valueOf(employee.getEmpId()));
            examination.setCreateTime(time);
            examinationDao.addExamination(examination);
            List<Examination> examinations=examinationDao.queryExaminationByNewID(examination.getNewId());
            if(examination.getExResult().equals("不通过")){
                //创建消息 通知方案小组 方案未通过
                Message message=new Message();
                if (examinations!=null)
                    message.setRefund(examinations.get(0).getExId());
                message.setStatus("0");
                message.setEmpId(powerDesign.getPowerDesignPerId());
                message.setNewId(examination.getNewId());
                messageDao.addMessage(message);

                //将审批过的未通过设计方案 状态设置为作废
                powerDesign.setStatus("-1");
                powerDesignDao.updatePowerDesign(powerDesign);

                /*//清除流程进程单中的电源设计方案
                String hql="from ProcessRecord u where u.newId='"+powerDesign.getNewId()+"'";
                List<ProcessRecord> processRecords=processRecordDao.QueryProcess(hql);
                ProcessRecord processRecord=processRecords.get(0);
                processRecord.setPowerId(null);
                processRecordDao.editProcess(processRecord);*/
            }else if(examination.getExResult().equals("通过")){
                //将审批过的通过设计方案 状态设置为审批完成
                powerDesign.setStatus("2");
                powerDesignDao.updatePowerDesign(powerDesign);

                //更改流程记录单中审核单号
                String hql="from ProcessRecord u where u.newId='"+examination.getNewId()+"'";
                List<ProcessRecord> processRecords=processRecordDao.QueryProcess(hql);
                ProcessRecord processRecord=processRecords.get(0);
                if (examinations!=null)
                    processRecord.setExId(examinations.get(0).getExId());
                processRecordDao.editProcess(processRecord);
            }
            flag="ExaminSuccess";
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return flag;
    }
}
