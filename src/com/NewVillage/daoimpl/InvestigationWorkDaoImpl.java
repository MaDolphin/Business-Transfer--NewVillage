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
            getHibernateTemplate().save(investigationWork);
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
    public boolean deleteInvestigationWork(InvestigationWork investigationWork) {
        try{
            getHibernateTemplate().delete(investigationWork);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateInvestigationWork(InvestigationWork investigationWork) {
        try{
            getHibernateTemplate().saveOrUpdate(investigationWork);
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
    public List<InvestigationWork> allInvestigationWorksByNewID(int newid) {
        List list = (List<InvestigationWork>) this.getHibernateTemplate().find("from InvestigationWork e where e.newId=? order by e.status desc ",new Object[]{newid});
        return list;
    }
}
