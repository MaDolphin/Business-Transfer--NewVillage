package com.NewVillage.daoimpl;

import com.NewVillage.dao.ReceiptDao;
import com.NewVillage.entity.PayRecord;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * Created by 珏 on 2016/6/2.
 */
public class ReceiptDaoImp extends HibernateDaoSupport implements ReceiptDao {
    @Override
    public void addPayRecord(PayRecord record) {
        try{
            this.getHibernateTemplate().save(record);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
