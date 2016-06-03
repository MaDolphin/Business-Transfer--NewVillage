package com.NewVillage.daoimpl;

import com.NewVillage.dao.JobInfoDao;
import com.NewVillage.entity.JobInfo;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by xfcq on 2016/6/3.
 */
public class JobInfoDaoImpl extends HibernateDaoSupport implements JobInfoDao {
    @Override
    public boolean addJobInfo(JobInfo jobInfo) {
        try{
            this.getHibernateTemplate().save(jobInfo);
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteJobInfo(JobInfo jobInfo) {
        try{
            this.getHibernateTemplate().delete(jobInfo);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateJobInfo(JobInfo jobInfo) {
        try{
            this.getHibernateTemplate().saveOrUpdate(jobInfo);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public JobInfo queryJobInfosByEmpID(int empid) {
        List list = (List<JobInfo>) this.getHibernateTemplate().find("from JobInfo e where e.empId=?",new Object[]{empid});
        if(list.size() >0){
            JobInfo jobInfo = (JobInfo) list.get(0);
            return jobInfo;
        }else {
            return null;
        }
    }

    @Override
    public JobInfo queryEmpByFreeDep(String empDep) {
        List list = (List<JobInfo>) this.getHibernateTemplate().find("from JobInfo e where e.empDep=? order by e.jobNum asc",new Object[]{empDep});
        if(list.size() >0){
            JobInfo jobInfo = (JobInfo) list.get(0);
            return jobInfo;
        }else {
            return null;
        }
    }
}
