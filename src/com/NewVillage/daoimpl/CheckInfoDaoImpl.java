package com.NewVillage.daoimpl;

import com.NewVillage.dao.CheckInfoDao;
import com.NewVillage.entity.CheckInfo;
import com.NewVillage.entity.Inspection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * Created by xfcq on 2016/6/3.
 */
public class CheckInfoDaoImpl extends HibernateDaoSupport implements CheckInfoDao {

    Configuration configuration=null;
    SessionFactory sessionFactory=null;
    Session session=null;
    Transaction transaction=null;

    public void addCheckInfo(CheckInfo checkInfo){
        try{

            this.getHibernateTemplate().save(checkInfo);

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
