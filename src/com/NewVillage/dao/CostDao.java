package com.NewVillage.dao;

import com.NewVillage.entity.BusinessCost;

import java.util.List;

/**
 * Created by 珏 on 2016/6/2.
 */
public interface CostDao {
    public List<BusinessCost> queryAllCost();
    public void updateCost(BusinessCost businessCost);
    BusinessCost QueryCostByID(int costId);
    void addBusinessCost(BusinessCost businessCost);
    BusinessCost queryBusinessCostByNewID(int newId);
}
