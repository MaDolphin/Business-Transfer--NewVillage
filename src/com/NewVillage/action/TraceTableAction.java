package com.NewVillage.action;

import com.NewVillage.dao.TraceTableDao;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by Dream on 2016/6/3.
 */
//1.11供电工程进度跟踪
public class TraceTableAction extends ActionSupport {
    private Map session;
    private TraceTableDao traceDao;

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }

    public TraceTableDao getTraceDao() {
        return traceDao;
    }

    public void setTraceDao(TraceTableDao traceDao) {
        this.traceDao = traceDao;
    }



}
