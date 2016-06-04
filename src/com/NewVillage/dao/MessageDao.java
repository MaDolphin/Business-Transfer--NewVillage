package com.NewVillage.dao;

import com.NewVillage.entity.*;

import java.util.List;

/**
 * Created by xfcq on 2016/6/3.
 */
public interface MessageDao {
    public void addMessage(Message message);
    public List<Message> allMessageByEmpIDStatus0(int empid);
    public boolean updateMessage(Message message);

}
