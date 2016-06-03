package com.NewVillage.daoimpl;

import com.NewVillage.dao.NewVillageDao;
import com.NewVillage.entity.NewVillage;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by xfcq on 2016/6/3.
 */
public class NewVillageDaoImpl extends HibernateDaoSupport implements NewVillageDao {

    @Override
    public boolean addNewVillage(NewVillage newVillage) {
        try{
            this.getHibernateTemplate().save(newVillage);
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public NewVillage queryNewVillageByID(int newid) {
        NewVillage newVillage = (NewVillage) (getHibernateTemplate().get(NewVillage.class,newid));
        return newVillage;
    }

    @Override
    public boolean deleteNewVillage(NewVillage newVillage) {
        try{
            this.getHibernateTemplate().delete(newVillage);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateNewVillage(NewVillage newVillage) {
        try{
            this.getHibernateTemplate().saveOrUpdate(newVillage);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<NewVillage> allNewVillagesByEmpID(int empid) {
        List a=(List<NewVillage>)this.getHibernateTemplate().find("from NewVillage n where n.newVilPerId=? order by n.status desc ",new Object[]{empid});
        return a;
    }
}
