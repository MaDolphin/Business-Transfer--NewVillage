package com.NewVillage.daoimpl;

import com.NewVillage.dao.MessageDao;
import com.NewVillage.entity.Message;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * Created by xfcq on 2016/6/3.
 */
public class MessageDaoImpl extends HibernateDaoSupport implements MessageDao {
    @Override
    public void addMessage(Message message) {
        try{
            this.getHibernateTemplate().save(message);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
