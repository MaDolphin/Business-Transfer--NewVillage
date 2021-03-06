package com.NewVillage.daoimpl;

import com.NewVillage.dao.UserDao;
import com.NewVillage.entity.User;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by xfcq on 2016/6/3.
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    @Override
    public boolean addUser(User user) {
        try{
            this.getHibernateTemplate().save(user);
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public User queryUserByID(int uid) {
        User user = (User) (getHibernateTemplate().get(User.class,uid));
        return user;
    }

    @Override
    public User queryUserByuserPid(String pid) {
        List a=(List<User>)this.getHibernateTemplate().find("from User u where u.userPid=?",new Object[]{pid});
        if(a.size()>0){
            return (User) a.get(0);
        }else {
            return null;
        }
    }

    @Override
    public boolean deleteUser(User user) {
        try{
            this.getHibernateTemplate().delete(user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateUser(User user) {
        try{
            this.getHibernateTemplate().saveOrUpdate(user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<User> allUsers() {
        List a=(List<User>)this.getHibernateTemplate().find("from User");
        return a;
    }

    @Override
    public List<User> queryUserByPid(String pid) {
        return (List<User>)this.getHibernateTemplate().find("from User u where u.userPid=?",new Object[]{pid});
    }
}
