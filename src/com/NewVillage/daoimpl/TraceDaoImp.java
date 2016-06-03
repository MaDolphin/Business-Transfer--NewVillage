package com.NewVillage.daoimpl;
import com.NewVillage.dao.TraceDao;
import com.NewVillage.entity.TraceTable;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by Dream on 2016/6/3.
 */
//进度跟踪DaoImp
public class TraceDaoImp extends HibernateDaoSupport implements TraceDao {
    @Override
    public List<TraceTable> QueryAllScheduleCondition() {
        List<TraceTable> list=null;
        try{
            list=(List<TraceTable>)this.getHibernateTemplate().find("from TraceTable");
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return list;
    }
}