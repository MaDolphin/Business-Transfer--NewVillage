package com.NewVillage.daoimpl;

import com.NewVillage.dao.PowerDesignDao;
import com.NewVillage.entity.PowerDesign;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by xfcq on 2016/6/3.
 */
public class PowerDesignDaoImpl extends HibernateDaoSupport implements PowerDesignDao {
    @Override
    public boolean addPowerDesign(PowerDesign powerDesign) {
        try{
            this.getHibernateTemplate().save(powerDesign);
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public PowerDesign queryPowerDesignByID(int powerid) {
        PowerDesign powerDesign = (PowerDesign) (getHibernateTemplate().get(PowerDesign.class,powerid));
        return powerDesign;
    }

    @Override
    public boolean deletePowerDesign(PowerDesign powerDesign) {
        try{
            this.getHibernateTemplate().delete(powerDesign);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updatePowerDesign(PowerDesign powerDesign) {
        try{
            this.getHibernateTemplate().saveOrUpdate(powerDesign);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<PowerDesign> allPowerDesignsByEmpID(int empid) {
        List list = (List<PowerDesign>) this.getHibernateTemplate().find("from PowerDesign e where e.powerDesignPerId=? order by e.status desc ",new Object[]{empid});
        return list;
    }

    @Override
    public List<PowerDesign> allPowerDesignsByNewID(int newid) {
        List list = (List<PowerDesign>) this.getHibernateTemplate().find("from PowerDesign e where e.newId=? order by e.status desc ",new Object[]{newid});
        return list;
    }
}
