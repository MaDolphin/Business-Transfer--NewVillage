package com.NewVillage.daoimpl;

import com.NewVillage.dao.MessageDao;
import com.NewVillage.entity.Message;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

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

    @Override
    public boolean updateMessage(Message message) {
        try{
            this.getHibernateTemplate().saveOrUpdate(message);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Message> allMessageByEmpIDStatus0(int empid) {
        List a=(List<Message>)this.getHibernateTemplate().find("from Message n where n.empId=? and n.status='0'",new Object[]{empid});
        return a;
    }
}
