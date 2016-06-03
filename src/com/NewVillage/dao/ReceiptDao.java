package com.NewVillage.dao;

import com.NewVillage.entity.BusinessCost;
import com.NewVillage.entity.PayRecord;

import java.util.List;

/**
 * Created by 珏 on 2016/6/2.
 *
 * 收款处理
 */
public interface  ReceiptDao {
    public void addPayRecord(PayRecord record);


    List<PayRecord> QueryAllRecord();
}
