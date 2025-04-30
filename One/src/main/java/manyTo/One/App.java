package manyTo.One;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
    	 Configuration cfg = new Configuration();
         cfg.configure();
         SessionFactory fact = cfg.buildSessionFactory();
         Session se = fact.openSession();
         se.beginTransaction();
         
         person p1 = new person();
         person p2 = new person();
         
         Bike b1 = new Bike(101,"pulsar",98000,p1);
         Bike b2 = new Bike(202,"KTM",99000,p1);
         
         List<Bike> bikeList1 = new ArrayList<Bike>();
         bikeList1.add(b1);
         bikeList1.add(b2);
         
         Bike b3 = new Bike(303,"honda",56000,p2);
         Bike b4 = new Bike(404,"apachi",78000,p2);
         
         List<Bike> bikeList2 = new ArrayList<Bike>();
         bikeList2.add(b3);
         bikeList2.add(b4);
         
         p1.setId(1);
         p1.setName("poorna");
         p1.setBikeList(bikeList1);
         
         p2.setId(2);
         p2.setName("vikas");
         p2.setBikeList(bikeList2);
         
         se.persist(p1);
         se.persist(p2);
         
         se.persist(b1);
         se.persist(b2);
         se.persist(b3);
         se.persist(b4);
         
         se.getTransaction().commit();
         
    }
}
