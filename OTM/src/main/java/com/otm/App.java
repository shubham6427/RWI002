package com.otm;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("OTM.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Distributor dis=new Distributor();
       dis.setDistributorCode(11);
       dis.setDistributorName("MST");
      
        Dealer de=new Dealer();
       de.setDealerCode(11014);
       de.setDealerName("Tiwari Motors");
       de.setProduct1("Apache");
       de.setProduct2("Raider");
       de.setProduct3("Radeon");
       

       Dealer de1=new Dealer();
      de1.setDealerCode(11022);
      de1.setDealerName("Mishra Machinery");
      de1.setProduct1("Scooty Pep");
      de1.setProduct2("Star City");
      de1.setProduct3("Scooty Zest");
      

      Dealer de2=new Dealer();
     de2.setDealerCode(11032);
     de2.setDealerName("Dwivedi Motors");
     de2.setProduct1("Victor");
     de2.setProduct2("Jupitor");
     de2.setProduct3("Ronin 225");
     

       
       
       List<Dealer> dealers=new ArrayList<Dealer>();
       dealers.add(de);
       dealers.add(de1);
       dealers.add(de2);
       
    dis.setDealers(dealers);   
    
        Session s= factory.openSession();
        Transaction tx=s.beginTransaction();
        
    
        s.save(dis);
        
        tx.commit();
        s.close();
        factory.close();
    }
}
