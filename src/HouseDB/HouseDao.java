/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HouseDB;

import House.Model.atrr;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author GRACE
 */
public class HouseDao {
    
    public void SaveRoom(atrr a){
    Session session=NewHibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    session.save(a);
    session.getTransaction().commit();
    session.close();
    
    
        
    }
    public List<atrr> DisplayRoom(){
    
    List<atrr> ls=new ArrayList<>();
    Session session=NewHibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    Query q=session.createQuery("From atrr");
    ls=q.list();
    return ls;
    }
    
}
