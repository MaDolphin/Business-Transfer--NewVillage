package com.NewVillage.daoimpl;

import com.NewVillage.dao.ProcessRecordDao;
import com.NewVillage.entity.ProcessRecord;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by 珏 on 2016/6/3.
 */
public class ProcessRecordDaoImpl extends HibernateDaoSupport implements ProcessRecordDao {
    @Override
    public List<ProcessRecord> QueryAllProcess() {
        List<ProcessRecord> list=null;
        try{
            list=(List<ProcessRecord>)this.getHibernateTemplate().find("from ProcessRecord");
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public List<ProcessRecord> QueryProcess(String hql) {
        List<ProcessRecord> list=null;
        try{
            list=(List<ProcessRecord>)this.getHibernateTemplate().find(hql);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public void addProcess(ProcessRecord processRecord) {
        try{
            this.getHibernateTemplate().save(processRecord);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void editProcess(ProcessRecord processRecord) {
        try{
            this.getHibernateTemplate().saveOrUpdate(processRecord);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
