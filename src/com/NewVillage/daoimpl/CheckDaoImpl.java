package com.NewVillage.daoimpl;

import com.NewVillage.dao.CheckDao;
import com.NewVillage.entity.DesignFileCheck;
import com.NewVillage.entity.Inspect;
import com.NewVillage.entity.Inspection;
import com.NewVillage.entity.ProcessRecord;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xfcq on 2016/6/3.
 */
public class CheckDaoImpl extends HibernateDaoSupport implements CheckDao {
    Configuration configuration= new Configuration().configure();
    SessionFactory sessionFactory=configuration.buildSessionFactory();
    Session session=sessionFactory.openSession();

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
    public List<DesignFileCheck> searchObject(String id){
        List<DesignFileCheck> list=null;
        String queryString="from DesignFileCheck d where d.status="+id+"";
        Query query = session.createQuery(queryString);
        list= query.list();
        return list;
    }
    public List<Inspect> searchInspect(int id){
        List<Inspect> list=null;
        String queryString="from Inspect i where i.checkId="+id+"";
        Query query = session.createQuery(queryString);
        list= query.list();
        return list;
    }
    public List<Inspect> searchInspectId(int id){
        List<Inspect> list=null;
        String queryString="from Inspect i where i.newId="+id+"";
        Query query = session.createQuery(queryString);
        list= query.list();
        return list;
    }
    public List<Inspection> searchInspection(int id){
        List<Inspection> list=null;
        String queryString="from Inspection i where i.insId="+id+"";
        Query query = session.createQuery(queryString);
        list= query.list();
        return list;
    }

    public List<Inspect> searchInspectManage(int id){
        List<Inspect> list=null;
        String queryString="from Inspect i where i.newId ="+id+" and i.status='0'";
        Query query = session.createQuery(queryString);
        list= query.list();
        return list;
    }

    public List<Inspection> searchInspectionManage(int id){
        List<Inspection> list=null;
        String queryString="from Inspection i where i.newId="+id+" and i.status='0'";
        Query query = session.createQuery(queryString);
        list= query.list();
        return list;
    }
    public List<Inspection> searchNopassCheckInfo(int id){
        List<Inspection> list=null;
        String queryString="from Inspection i where i.newId="+id+" and i.status='1'";
        Query query = session.createQuery(queryString);
        list= query.list();
        return list;
    }
    public List<DesignFileCheck> searchInfo(){
        List<DesignFileCheck> list=null;
        String queryString="from DesignFileCheck d where d.status='2'";
        Query query = session.createQuery(queryString);
        list= query.list();
        return list;
    }
    public List<ProcessRecord> searchProcessRecord(int id){
        List<ProcessRecord> list=null;
        String queryString="from ProcessRecord p where p.newId="+id+"";
        Query query = session.createQuery(queryString);
        list= query.list();
        return list;
    }
}
