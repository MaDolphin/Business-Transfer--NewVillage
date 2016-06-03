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
}
