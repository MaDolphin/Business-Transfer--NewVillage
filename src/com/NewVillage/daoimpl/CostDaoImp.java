package com.NewVillage.daoimpl;

import com.NewVillage.dao.CostDao;
import com.NewVillage.entity.BusinessCost;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.*;

/**
 * Created by 珏 on 2016/6/2.
 */
public class CostDaoImp extends HibernateDaoSupport implements CostDao {
    @Override
    public List<BusinessCost> QueryAllCost() {
        List<BusinessCost> list=null;
        try{
            list=(List<BusinessCost>)this.getHibernateTemplate().find("from BusinessCost");
        }catch (Exception ex){
            ex.printStackTrace();
        }
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
    public void ExaminCost(BusinessCost businessCost) {
        try{
            this.getHibernateTemplate().update(businessCost);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }



}
