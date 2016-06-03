package com.NewVillage.action;

import com.NewVillage.dao.TraceDao;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by Dream on 2016/6/3.
 */
//1.11供电工程进度跟踪
public class TraceTableAction extends ActionSupport {
    private Map session;
    private TraceDao traceDao;

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }

    public TraceDao getTraceDao() {
        return traceDao;
    }

    public void setTraceDao(TraceDao traceDao) {
        this.traceDao = traceDao;
    }



}
