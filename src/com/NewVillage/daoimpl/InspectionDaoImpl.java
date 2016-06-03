package com.NewVillage.daoimpl;

import com.NewVillage.dao.InspectionDao;
import com.NewVillage.entity.Inspection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * Created by xfcq on 2016/6/3.
 */
public class InspectionDaoImpl extends HibernateDaoSupport implements InspectionDao {
    Configuration configuration=null;
    SessionFactory sessionFactory=null;
    Session session=null;
    Transaction transaction=null;

    public void addInspect(Inspection inspection){
        try{

            this.getHibernateTemplate().save(inspection);

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
