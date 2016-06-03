package com.NewVillage.daoimpl;

import com.NewVillage.dao.DesignFileCheckDao;
import com.NewVillage.entity.DesignFileCheck;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by Dream on 2016/6/3.
 */
public class DesignFileCheckDaoImpl extends HibernateDaoSupport implements DesignFileCheckDao{

    @Override
    public List<DesignFileCheck> QueryAllDesignFileCheckMessage() {
        List<DesignFileCheck> list=null;
        try{
            list=(List<DesignFileCheck>)this.getHibernateTemplate().find("from DesignFileCheck");
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public void addDesignFileCheckRecord(DesignFileCheck designFileCheck) {
        try{
            this.getHibernateTemplate().save(designFileCheck);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public boolean deleteDesignFileCheckRecord(DesignFileCheck designFileCheck) {
        try{
            this.getHibernateTemplate().delete(designFileCheck);
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public DesignFileCheck queryDesignFileCheckRecordByID(int recordId) {
        DesignFileCheck designFileCheck = (DesignFileCheck) (getHibernateTemplate().get(DesignFileCheck.class,recordId));
        return designFileCheck;
    }

    @Override
    public boolean existDesignFileCheckRecordById(int recordId) {
        List<DesignFileCheck> list = (List<DesignFileCheck>)(getHibernateTemplate().get(DesignFileCheck.class,recordId));
        if(list.size() == 0)
            return false;
        else {
            return true;
        }
    }

    @Override
    public boolean updateDesignFileCheckRecord(DesignFileCheck designFileCheck) {
        try{
            this.getHibernateTemplate().saveOrUpdate(designFileCheck);
            return true;
        }catch (RuntimeException e){
            e.printStackTrace();
            return false;
        }
    }
}
