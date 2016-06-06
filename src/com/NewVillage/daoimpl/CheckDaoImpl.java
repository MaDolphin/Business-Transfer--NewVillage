package com.NewVillage.daoimpl;

import com.NewVillage.dao.CheckDao;
import com.NewVillage.entity.*;
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
        try {
            List<Inspect> list=(List<Inspect>) this.getHibernateTemplate().find("from Inspect i where i.checkId=?",new Object[]{id});
            return list;
        } catch (HibernateException e) {
            e.printStackTrace();
            throw e;
        }
//        List<Inspect> list=null;
//        String queryString="from Inspect i where i.checkId="+id+"";
//        Query query = session.createQuery(queryString);
//        list= query.list();
//        return list;
    }
    public List<Inspect> searchInspectId(int id){
        try {
            List<Inspect> list=(List<Inspect>) this.getHibernateTemplate().find("from Inspect i where i.newId=?",new Object[]{id});
            return list;
        } catch (HibernateException e) {
            e.printStackTrace();
            throw e;
        }

    }
    public List<CheckInfo> searchCheckInfoId(int id){
        try {
            List<CheckInfo> list=(List<CheckInfo>) this.getHibernateTemplate().find("from CheckInfo i where i.newId=?",new Object[]{id});
            return list;
        } catch (HibernateException e) {
            e.printStackTrace();
            throw e;
        }

    }
    public List<Inspection> searchInspectionId(int id){
        try {
            List<Inspection> list=(List<Inspection>) this.getHibernateTemplate().find("from Inspection i where i.newId=?",new Object[]{id});
            return list;
        } catch (HibernateException e) {
            e.printStackTrace();
            throw e;
        }

    }
    public List<Inspection> searchInspection(int id) {
        try {
            List<Inspection> list = (List<Inspection>) this.getHibernateTemplate().find("from Inspection i where i.insId=?", new Object[]{id});
            return list;
        } catch (HibernateException e) {
            e.printStackTrace();
            throw e;
//        }
//        List<Inspection> list=null;
//        String queryString="from Inspection i where i.insId="+id+"";
//        Query query = session.createQuery(queryString);
//        list= query.list();
//        return list;
        }
    }

    public List<Inspect> searchInspectManage(int id,String status){
//        List<Inspect> list=null;
//        String queryString="from Inspect i where i.newId ="+id+" and i.status='0'";
//        Query query = session.createQuery(queryString);
//        list= query.list();
//        return list;
        try {
            List<Inspect> list=(List<Inspect>) this.getHibernateTemplate().find("from Inspect i where i.newId=? and i.status=?",new Object[]{id,status});
            return list;
        } catch (HibernateException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public List<Inspection> searchInspectionManage(int id){
        try {
            List<Inspection> list=(List<Inspection>) this.getHibernateTemplate().find("from Inspection i where i.newId=? and i.status='0' or i.status='1'",new Object[]{id});
            return list;
        } catch (HibernateException e) {
            e.printStackTrace();
            throw e;
        }
//        List<Inspection> list=null;
//        String queryString="from Inspection i where i.newId="+id+" and i.status='0'";
//        Query query = session.createQuery(queryString);
//        list= query.list();
//        return list;
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
