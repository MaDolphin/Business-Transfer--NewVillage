package com.NewVillage.action;

import java.util.*;

import com.NewVillage.dao.CostDao;
import com.NewVillage.dao.ProcessRecordDao;
import com.NewVillage.dao.ReceiptDao;
import com.NewVillage.entity.*;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

/**
 * Created by 珏 on 2016/6/2.
 *
 * 5.财务 1.9确定费用 1.10业务收费
 */
public class FinanceAction extends ActionSupport{
    private Map session;
    private ReceiptDao receiptdao;
    private CostDao costdao;
    private ProcessRecordDao processRecordDao;
    private PayRecord payRecord;
    private BusinessCost businessCost;
    public void setSession(Map session) {
        this.session = session;
    }

    public void setReceiptdao(ReceiptDao receiptdao) {
        this.receiptdao = receiptdao;
    }

    public void setCostdao(CostDao costdao) {
        this.costdao = costdao;
    }

    public void setPayRecord(PayRecord payRecord) {
        this.payRecord = payRecord;
    }

    public void setBusinessCost(BusinessCost businessCost) {
        this.businessCost = businessCost;
    }

    public void setProcessRecordDao(ProcessRecordDao processRecordDao) {
        this.processRecordDao = processRecordDao;
    }

    public String QueryCost(){
        try{
            List<BusinessCost> businessCosts=costdao.QueryAllCost();
            session.put("businessCosts",businessCosts);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return SUCCESS;
    }

    public String QueryCostByID(){
        try{
            BusinessCost businessCosts=costdao.QueryCostByID(businessCost.getCostId());
            session.put("businessCostInfo",businessCosts);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return SUCCESS;
    }

    public String QueryPayRecord(){
        try{
            List<PayRecord> payRecords=receiptdao.QueryAllRecord();
            session.put("payRecords",payRecords);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return SUCCESS;
    }

    public String PayRecord(){
        String flag=INPUT;
        try{
            session.put("NewId",businessCost.getNewId());
            String hql="from PayRecord u where u.newId='"+businessCost.getNewId()+"'";
            List<PayRecord> pay=receiptdao.QueryRecord(hql);
            if(pay.size()>=0&&pay.size()<3)
                flag=SUCCESS;
            switch (pay.size()){
                case 0:session.put("perenct",20);break;
                case 1:session.put("perenct",40);break;
                case 2:session.put("perenct",40);break;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return flag;
    }

    public String ExaminCost(){
        try{
            costdao.ExaminCost(businessCost);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return SUCCESS;
    }

    @Override
    public String execute() {
        String flag=INPUT;
        double count=0;
        try{
            String hql="from ProcessRceord u where u.newId='"+payRecord.getNewId()+"'";
            List<ProcessRecord> processRceords=processRecordDao.QueryProcess(hql);
            if(processRceords!=null) {
                int payId = processRceords.get(0).getPayId();
                count=costdao.QueryCostByID(payId).getCharge();
            }
            double non_payment=count-payRecord.getSumPay()-payRecord.getPayment();
            if(non_payment>=0) {
                receiptdao.addPayRecord(payRecord);
                flag = SUCCESS;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return flag;
    }
}
