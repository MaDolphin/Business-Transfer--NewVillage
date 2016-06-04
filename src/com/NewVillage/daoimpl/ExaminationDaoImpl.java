package com.NewVillage.daoimpl;

import com.NewVillage.dao.ExaminationDao;
import com.NewVillage.entity.Examination;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import  java.util.*;
/**
 * Created by 珏 on 2016/6/3.
 */
public class ExaminationDaoImpl extends HibernateDaoSupport implements ExaminationDao{
    @Override
    public void addExamination(Examination examination) {
        try{
            this.getHibernateTemplate().save(examination);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public List<Examination> queryExaminationByNewID(Integer newId) {
        return (List<Examination>)this.getHibernateTemplate().find("from Examination u where u.newId=?");
    }
}
