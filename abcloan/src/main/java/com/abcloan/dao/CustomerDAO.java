package com.abcloan.dao;



import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.abcloan.Admin;
import com.abcloan.Customer;
import com.abcloan.HomeFinanceProvider;
import com.abcloan.LAD;

public class CustomerDAO implements CustomerDAOInterface {
	 final Logger lic=Logger.getLogger(CustomerDAO.class.getName());
	public int searchAllProfile() {
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpacheck");
	    EntityManager em = emf.createEntityManager();

	    int i=0;

	    Query q = em.createQuery("from com.abcloan.Admin c where c.loan_id=:loan_id");
	 
	    q.setParameter("loan_id", 181);
	    List<HomeFinanceProvider> ll = q.getResultList();
	    lic.info("Details for the above loan id are:" );
	    for (HomeFinanceProvider cc : ll) {
	    	lic.info("Type of loan is " + cc.getTypeofloan());
	        lic.info("Rate of Interest is " + cc.getRate_of_interest());
	        lic.info("income is " + cc.getIncome());
	        lic.info("Duration is " + cc.getDuration());
	       

  em.close();
  		

	    }
	    i=1;
  		return i;
}
	
	public int viewAllProfile() {
		
		
		
		
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpacheck");
		 EntityManager em2 = emf.createEntityManager();
		 int i=0;
	        Query q2 = em2.createQuery("from com.abcloan.Admin c ");
	      
	        List<HomeFinanceProvider> ll1 = q2.getResultList();



	        for (HomeFinanceProvider cc1 : ll1) {
	        	lic.info("Type of Loan is " + cc1.getTypeofloan());
	            lic.info("Rate of interest for loan is " + cc1.getRate_of_interest());
	            lic.info("Duration is"+cc1.getDuration());
	            lic.info("Income is"+cc1.getIncome());
	            
	        }
	        em2.close();
	        i=1;
	        return i;
	}
	
public int apply() throws IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpacheck");

	       
	        EntityManager em = emf.createEntityManager();
	        
	        EntityTransaction t = em.getTransaction();
	        t.begin();  
	         LAD d=new LAD();
	         
	         int i=0;
	         d.setLad_id(10);
	        d.setPassword("abc");
	        d.setStatus("Pending");
	        em.persist(d);
	        List<LAD> id1=new ArrayList<LAD>();
	        id1.add(d);
	       Customer c = new Customer();
	        c.setAddress("Mumbai");
	       c.setLoan_id(183);
	        c.setName("Jen");
	        c.setContact(64453782);
	       
	        c.setType_of_loan("Bike loan");
	        c.setIncome(2872447);
	        c.setAcc_no(263563);
	        c.setLd1(id1);
	        lic.info("Your loan is applied");
	       
	        em.persist(c);
	        d.setCust1(c);
	        em.merge(d);
	        t.commit();
	        em.close();
	        i=1;
	        return i;
	    }
	
	

	}

