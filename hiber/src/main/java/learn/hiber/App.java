package learn.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//student st = new student(3,"usha","silk",2025);
       Configuration cfg = new Configuration();
       cfg.configure();
       SessionFactory fact = cfg.buildSessionFactory();
      // System.out.println(fact);
       
       Session se = fact.openSession();
       se.beginTransaction();
       //inserting the data into db
//       Transaction tx = se.beginTransaction();
//      // se.save(st);
//       se.persist(st);
//       tx.commit();
       
       //fetching dtata from db
//       student st = se.get(student.class, 2);
//       System.out.println(st);
       
//       //update data
//       student st = se.get(student.class, 2);
//       st.setYop(2021);
//       Transaction tx = se.beginTransaction();
//      se.update(st);
//       se.merge(st);
//       tx.commit();
       
       //delete data
//       student st = se.get(student.class, 3);
//       Transaction tx = se.beginTransaction();
//       se.remove(st);
//       tx.commit();
       
       person p = new person();
       AadharCard ac = new AadharCard(111,"vidya","btm","female",p);
       p.setId(101);
       p.setNickname("vid");
       p.setCard(ac);
       
       se.persist(p);
       se.persist(ac);
       
       se.getTransaction().commit();
       
    }
}
