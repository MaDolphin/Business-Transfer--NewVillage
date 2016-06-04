package com.NewVillage.daoimpl;

import com.NewVillage.dao.PowerDesignReplyDao;
import com.NewVillage.entity.PowerDesignReply;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by 珏 on 2016/6/3.
 */
public class PowerDesignReplyDaoImpl extends HibernateDaoSupport implements PowerDesignReplyDao{
    @Override
    public void addPowerDesignReply(PowerDesignReply powerDesignReply) {
        try{
            this.getHibernateTemplate().save(powerDesignReply);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public PowerDesignReply queryPowerDesignReplyByID(int newId) {
        PowerDesignReply powerDesignReply = (PowerDesignReply) (getHibernateTemplate().get(PowerDesignReply.class,newId));
        return powerDesignReply;
    }

    @Override
    public List<PowerDesignReply> allPowerDesignReply() {
        return (List<PowerDesignReply>) getHibernateTemplate().find("from PowerDesignReply u where u.status='1'");
    }

    @Override
    public boolean updatePowerDesignReply(PowerDesignReply powerDesignReply) {
        try{
            this.getHibernateTemplate().saveOrUpdate(powerDesignReply);
            return true;
        }catch (RuntimeException e){
            e.printStackTrace();
            return false;
        }
    }
}
