package com.NewVillage.daoimpl;

import com.NewVillage.dao.InvestigationSiteDao;
import com.NewVillage.entity.InvestigationSite;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by xfcq on 2016/6/3.
 */
public class InvestigationSiteDaoImpl extends HibernateDaoSupport implements InvestigationSiteDao {
    @Override
    public boolean addInvestigationSite(InvestigationSite investigationSite) {
        try{
            this.getHibernateTemplate().save(investigationSite);
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public InvestigationSite queryInvestigationSiteByID(int invesSiteId) {
        InvestigationSite investigationSite = (InvestigationSite) (getHibernateTemplate().get(InvestigationSite.class,invesSiteId));
        return investigationSite;
    }

    @Override
    public InvestigationSite queryInvestigationSiteByNewIDStatus0(int newid) {
        List a=(List<InvestigationSite>)this.getHibernateTemplate().find("from InvestigationSite n where n.newId=? and n.status='0'",new Object[]{newid});
        if(a.size()>0){
            return (InvestigationSite) a.get(0);
        }else {
            return null;
        }
    }

    @Override
    public boolean deleteInvestigationSite(InvestigationSite investigationSite) {
        try{
            this.getHibernateTemplate().delete(investigationSite);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateInvestigationSite(InvestigationSite investigationSite) {
        try{
            this.getHibernateTemplate().saveOrUpdate(investigationSite);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<InvestigationSite> allInvestigationWorksByEmpID(int empid) {
        List list = (List<InvestigationSite>) this.getHibernateTemplate().find("from InvestigationSite e where e.invesPerId=? order by e.status desc ",new Object[]{empid});
        return list;
    }

    @Override
    public List<InvestigationSite> allInvestigationWorksByNewID(int newid) {
        List list = (List<InvestigationSite>) this.getHibernateTemplate().find("from InvestigationSite e where e.newId=? order by e.status desc ",new Object[]{newid});
        return list;
    }
}
