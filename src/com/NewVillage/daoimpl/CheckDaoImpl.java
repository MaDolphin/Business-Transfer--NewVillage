package com.NewVillage.daoimpl;

import com.NewVillage.dao.CheckDao;
import com.NewVillage.entity.Inspect;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xfcq on 2016/6/3.
 */
public class CheckDaoImpl extends HibernateDaoSupport implements CheckDao {
    Configuration configuration=null;
    SessionFactory sessionFactory=null;
    Session session=null;
    Transaction transaction=null;

    public void addCheck(Inspect inspect){
        try{

            this.getHibernateTemplate().save(inspect);

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
    public void updateObject(Object object){
        try {
            this.getHibernateTemplate().update(object);
        } catch (HibernateException e) {
            e.printStackTrace();
            throw e;
        }

    }
}
