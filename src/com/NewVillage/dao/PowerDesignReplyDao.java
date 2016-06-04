package com.NewVillage.dao;

import com.NewVillage.entity.PowerDesignReply;
import java.util.*;

/**
 * Created by 珏 on 2016/6/3.
 */
public interface PowerDesignReplyDao {
    void addPowerDesignReply(PowerDesignReply powerDesignReply);
    public PowerDesignReply queryPowerDesignReplyByID(int newId);
    List<PowerDesignReply> allPowerDesignReply();
    public boolean updatePowerDesignReply(PowerDesignReply powerDesignReply);

}
