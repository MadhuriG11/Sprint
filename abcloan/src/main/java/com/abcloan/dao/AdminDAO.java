package com.abcloan.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.abcloan.Admin;
import com.abcloan.App;
import com.abcloan.HomeFinanceProvider;



public class AdminDAO implements AdminDAOInterface {
    final Logger lic=Logger.getLogger(AdminDAO.class.getName());
    final String s="jpacheck";
	public int createProfile() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(s);

        EntityManager em = emf.createEntityManager();

 
        HomeFinanceProvider c = new HomeFinanceProvider();
        int i=0;
        c.setLoan_id(183);
       
        c.setName("Uj");
        c.setDuration(6);
        c.setIncome(150000);
        c.setTypeofloan("Home loan");
        c.setRate_of_interest(2.8);
       
        EntityTransaction t = em.getTransaction();
        t.begin();

 
        em.persist(c);

        t.commit();
        i=1;
        return i;
    }
	
	
	
	

	public int deleteProfile()   {
		// TODO Auto-generated method stub
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(s);
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        
        Admin c = new Admin();
        int i=0;
        c.setLoan_id(182);
        
     
        
        
        t.begin();
            em.remove(em.find(Admin.class, 182));
          
        t.commit();
	i=1;
	return i;
	
		

		
	}
	
	public ArrayList<HomeFinanceProvider> viewAllProfile()  {

	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(s);
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("from com.abcloan.Admin");
		List<HomeFinanceProvider> ll = q.getResultList();
	
		for (HomeFinanceProvider cc : ll) {
			lic.info("For Loan Id " + cc.getLoan_id());
			lic.info( "Description of loan is " +cc.getName());
			lic.info( "Loan Type is"+ cc.getTypeofloan());
			lic.info("Rate of Interest is " + cc.getRate_of_interest());
			lic.info("Income  is " + cc.getIncome());
			lic.info("Duration is " + cc.getDuration());
		}
		em.close();
	
        return (ArrayList<HomeFinanceProvider>) ll;
	}
    
	

	public int updateProfile() {
		// TODO Auto-generated method stub
		
		
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory(s);
		    EntityManager em = emf.createEntityManager();



		    Query q = em.createQuery("from com.abcloan.Admin c where c.loan_id=:loan_id");
		  String li="loan_id";
		    q.setParameter(li, 182);
		    List<HomeFinanceProvider> ll = q.getResultList();
		    lic.info("before update");
		    for (HomeFinanceProvider cc : ll) {
		    	lic.info("Type of loan is " + cc.getTypeofloan());
		    }
		    em.close();



		    EntityManager em1 = emf.createEntityManager();
		    EntityTransaction t = em1.getTransaction();
		    int j=0;
		    t.begin();
		    
		    Query q1 = em1.createQuery("update com.abcloan.Admin c set c.typeofloan=:typeofloan where c.loan_id=:loan_id");
		    q1.setParameter("typeofloan", "home loan");
		    q1.setParameter(li, 182);



		    int i = q1.executeUpdate();
		    
		    t.commit();
		    em1.close();
		   

		    if (i > 0) {
		    	lic.info("after update");
		        EntityManager em2 = emf.createEntityManager();
		        Query q2 = em2.createQuery("from com.abcloan.Admin c where c.loan_id=:loan_id");
		        q2.setParameter(li, 111);
		        List<HomeFinanceProvider> ll1 = q2.getResultList();



		        for (HomeFinanceProvider cc1 : ll1) {
		        	lic.info("Type of loan is " + cc1.getTypeofloan());
		        }
		        em2.close();
		        
		    } j=1;
		    return j;

		    
		    
		    
		}
		
		
		
		
		
		
		
		
	}

 
