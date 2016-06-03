package com.NewVillage.daoimpl;

import com.NewVillage.dao.ReceiptDao;
import com.NewVillage.entity.BusinessCost;
import com.NewVillage.entity.PayRecord;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by 珏 on 2016/6/2.
 */
public class ReceiptDaoImpl extends HibernateDaoSupport implements ReceiptDao {
    @Override
    public void addPayRecord(PayRecord record) {
        try{
            this.getHibernateTemplate().save(record);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public List<PayRecord> QueryRecord(String hql) {
        List<PayRecord> list=null;
        try{
            list=(List<PayRecord>)this.getHibernateTemplate().find(hql);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public List<PayRecord> QueryAllRecord() {
        List<PayRecord> list=null;
        try{
            list=(List<PayRecord>)this.getHibernateTemplate().find("from PayRecord ");
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return list;
    }
}
