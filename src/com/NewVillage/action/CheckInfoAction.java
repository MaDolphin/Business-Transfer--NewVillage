package com.NewVillage.action;

import com.NewVillage.dao.CheckDao;
import com.NewVillage.dao.CheckInfoDao;
import com.NewVillage.entity.CheckInfo;
import com.opensymphony.xwork2.ActionContext;

import java.sql.Timestamp;
import java.util.Map;

/**
 * Created by Brown on 2016/6/4.
 */
public class CheckInfoAction {
    CheckInfo checkInfo;
    CheckInfoDao checkInfoDao;
    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public CheckInfo getCheckInfo() {
        return checkInfo;
    }

    public void setCheckInfo(CheckInfo checkInfo) {
        this.checkInfo = checkInfo;
    }

    public void setCheckInfoDao(CheckInfoDao checkInfoDao) {
        this.checkInfoDao = checkInfoDao;
    }

    ActionContext actionContext= ActionContext.getContext();
    Map session=actionContext.getSession();

    public String add() throws Exception{
        System.out.print(checkInfo);

        checkInfo.setNewId(1);
        checkInfo.setCreateTime(timestamp);
        checkInfoDao.addCheckInfo(checkInfo);
        return "success";
    }
}
