package com.NewVillage.dao;

import com.NewVillage.entity.JobInfo;

import java.util.List;

/**
 * Created by xfcq on 2016/6/3.
 */
public interface JobInfoDao {
    public boolean addJobInfo(JobInfo jobInfo);
    public boolean deleteJobInfo(JobInfo jobInfo);
    public boolean updateJobInfo(JobInfo jobInfo);
    public JobInfo queryJobInfosByEmpID(int empid);
    public JobInfo queryEmpByFreeDep(String empDep);
}
