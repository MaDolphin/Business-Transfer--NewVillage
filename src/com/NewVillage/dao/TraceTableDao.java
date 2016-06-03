package com.NewVillage.dao;

import com.NewVillage.entity.TraceTable;

import java.util.List;

/**
 * Created by Dream on 2016/6/3.
 */

//进度跟踪Dao
public interface TraceTableDao {
    public List<TraceTable> QueryAllScheduleCondition();
    public void addTraceTableRecord(TraceTable traceTable);
    public boolean deleteTraceTableRecord(TraceTable traceTable);
    public TraceTable queryTraceTableRecordByID(int recordId);
    public boolean existTraceTableRecordById(int recordId);
    public boolean updateTraceTableRecord(TraceTable traceTable);
}
