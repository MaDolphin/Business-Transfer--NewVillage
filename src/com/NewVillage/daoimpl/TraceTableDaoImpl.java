package com.NewVillage.daoimpl;
import com.NewVillage.dao.TraceTableDao;
import com.NewVillage.entity.TraceTable;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by Dream on 2016/6/3.
 */
//进度跟踪DaoImp
public class TraceTableDaoImpl extends HibernateDaoSupport implements TraceTableDao {
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

    @Override
    public boolean addTraceTableRecord(TraceTable traceTable) {
        try{
            this.getHibernateTemplate().save(traceTable);
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteTraceTableRecord(TraceTable traceTable) {
        try{
            this.getHibernateTemplate().delete(traceTable);
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public TraceTable queryTraceTableRecordByID(int recordId) {
        TraceTable traceTable = (TraceTable) (getHibernateTemplate().get(TraceTable.class,recordId));
        return traceTable;
    }

    @Override
    public boolean existTraceTableRecordById(int recordId) {
        List<TraceTable> list = (List<TraceTable>)(getHibernateTemplate().get(TraceTable.class,recordId));
        if(list.size() == 0)
            return false;
        else {
            return true;
        }
    }

    @Override
    public boolean updateTraceTableRecord(TraceTable traceTable) {
        try{
            this.getHibernateTemplate().saveOrUpdate(traceTable);
            return true;
        }catch (RuntimeException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public TraceTable queryTraceTableRecordByNewId(int newId) {
        List<TraceTable> list = (List<TraceTable>) (getHibernateTemplate().find("from TraceTable t where t.newId=?",new Object[]{newId}));
        if(list.size()>0){
            return (TraceTable) list.get(0);
        }else {
            return null;
        }
    }
}
