package com.NewVillage.dao;

import com.NewVillage.entity.TraceTable;

import java.util.List;

/**
 * Created by Dream on 2016/6/3.
 */

//进度跟踪Dao
public interface TraceDao {
    public List<TraceTable> QueryAllScheduleCondition();
}
