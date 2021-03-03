/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hiber;


import entity.Studentyi;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import utils.NewHibernateUtil;

/**
 *
 * @author kazakoff
 */
public class Hiber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
       Query query = session.createQuery("from Studentyi s");
        
        List<Studentyi> studs = (List<Studentyi>)query.list();
        
        for (Studentyi stud : studs){
            System.out.println(stud.getFamiliya());
        }
        
        session.getTransaction().commit();
        session.close();
        }
   
}
