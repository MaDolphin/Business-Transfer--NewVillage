package com.NewVillage.daoimpl;

import com.NewVillage.dao.InvestigationWorkDao;
import com.NewVillage.entity.InvestigationWork;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by xfcq on 2016/6/3.
 */
public class InvestigationWorkDaoImpl extends HibernateDaoSupport implements InvestigationWorkDao {
    @Override
    public boolean addInvestigationWork(InvestigationWork investigationWork) {
        try{
            this.getHibernateTemplate().save(investigationWork);
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public InvestigationWork queryInvestigationWorkByID(int investid) {
        InvestigationWork investigationWork = (InvestigationWork) (getHibernateTemplate().get(InvestigationWork.class,investid));
        return investigationWork;
    }

    @Override
    public InvestigationWork queryInvestigationWorkByNewIDStatus0(int newid) {
        List list = (List<InvestigationWork>) this.getHibernateTemplate().find("from InvestigationWork e where e.newId=? and e.status='0' ",new Object[]{newid});
        if(list.size() >0){
            return (InvestigationWork) list.get(0);
        }else {
            return null;
        }
    }

    @Override
    public InvestigationWork queryInvestigationWorkByNewIDStatus1(int newid) {
        List list = (List<InvestigationWork>) this.getHibernateTemplate().find("from InvestigationWork e where e.newId=? and e.status='1' ",new Object[]{newid});
        if(list.size() >0){
            return (InvestigationWork) list.get(0);
        }else {
            return null;
        }
    }

    @Override
    public boolean deleteInvestigationWork(InvestigationWork investigationWork) {
        try{
            this.getHibernateTemplate().delete(investigationWork);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateInvestigationWork(InvestigationWork investigationWork) {
        try{
            this.getHibernateTemplate().saveOrUpdate(investigationWork);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<InvestigationWork> allInvestigationWorksByEmpID(int empid) {
        List list = (List<InvestigationWork>) this.getHibernateTemplate().find("from InvestigationWork e where e.invesPerId=? order by e.status desc ",new Object[]{empid});
        return list;
    }

    @Override
    public List<InvestigationWork> allInvestigationWorksINGByEmpID(int empid) {
        List list = (List<InvestigationWork>) this.getHibernateTemplate().find("from InvestigationWork e where e.invesPerId=? and e.status='1'",new Object[]{empid});
        return list;
    }

    @Override
    public List<InvestigationWork> allInvestigationWorksByNewID(int newid) {
        List list = (List<InvestigationWork>) this.getHibernateTemplate().find("from InvestigationWork e where e.newId=? order by e.status desc ",new Object[]{newid});
        return list;
    }

}
