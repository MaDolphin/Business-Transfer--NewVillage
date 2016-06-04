package com.NewVillage.daoimpl;

import com.NewVillage.dao.CostDao;
import com.NewVillage.entity.BusinessCost;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.*;

/**
 * Created by 珏 on 2016/6/2.
 */
public class CostDaoImpl extends HibernateDaoSupport implements CostDao {
    @Override
    public List<BusinessCost> queryAllCost() {
       /*
        try{
            list=(List<BusinessCost>)this.getHibernateTemplate().find("from BusinessCost");
        }catch (Exception ex){
            ex.printStackTrace();
        }*/
        List<BusinessCost> list=(List<BusinessCost>)this.getHibernateTemplate().find("from BusinessCost");
        return list;
    }

    @Override
    public BusinessCost QueryCostByID(int costId) {
        BusinessCost cost=null;
        try{
            cost=(BusinessCost)this.getHibernateTemplate().get(BusinessCost.class,costId);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return cost;
    }

    @Override
    public void addBusinessCost(BusinessCost businessCost) {
        try{
            this.getHibernateTemplate().save(businessCost);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public BusinessCost queryBusinessCostByNewID(int newId) {
        List<BusinessCost> businessCosts=(List<BusinessCost>)this.getHibernateTemplate().find("from BusinessCost u where u.newId=?",new Object[]{newId});
        return businessCosts.get(0);
    }

    @Override
    public void updateCost(BusinessCost businessCost) {
        try{
            this.getHibernateTemplate().saveOrUpdate(businessCost);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }



}
