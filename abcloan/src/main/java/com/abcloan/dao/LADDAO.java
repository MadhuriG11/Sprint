package com.abcloan.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.abcloan.Customer;


public class LADDAO implements LADDAOInterface {
	final Logger lic=Logger.getLogger(LADDAO.class.getName());

	public ArrayList<Customer> viewAllVisitor() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpacheck");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("from com.abcloan.Customer");
		
		List<Customer> ll = q.getResultList();
		
		for (Customer cc : ll) {
			 lic.info("Customer id is " + cc.getCust_id());
			 lic.info( "Customer name is " + cc.getName());
			 lic.info( "Address of customer is "+ cc.getAddress());
			 lic.info("Customer contact is " + cc.getContact());
			 lic.info("Income  is " + cc.getIncome());
			 lic.info("Type of loan is " + cc.getType_of_loan());
			 lic.info("Account number is " + cc.getAcc_no());
		}
		em.close();
		 
        return (ArrayList<Customer>) ll;
       
        
	}

		 
	 
		 
	public int approveloan() throws Exception {
		
		 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpacheck");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		
		int i=0;
		
		t.begin();
		
		 lic.info("Enter customer id");
		Scanner sc = new Scanner(System.in);
		long id = sc.nextLong();
		
		Query q1 = em.createQuery("from com.abcloan.Customer c where c.cust_id=:cust_id");
	    q1.setParameter("cust_id", id);
	    List<Customer> t1=q1.getResultList();
	    if(!(t1.isEmpty())) {
	    for(Customer t2:t1)
	    {
	    	 lic.info("Income: "+t2.getIncome());
	    	 lic.info("Type of loan: "+t2.getType_of_loan());
	    }
	    
	    lic.info("Is income valid for applied loan(y/n)");
	    String ch = sc.next();
	    
	    if(ch.equals("y"))
	    {
	    	Customer l1= new Customer();
	    	l1.setCust_id(id);
	    	
	    	 Query q2 = em.createQuery("update LAD set status =:status where cust1=:cust_id");
		        q2.setParameter("status", "Approved");
		        q2.setParameter("cust_id", l1);
		        q2.executeUpdate();
		        lic.info("Approved");
	    }
	
	    else
	    {	Customer l2= new Customer();
    	l2.setCust_id(id);
	    	 Query q2 = em.createQuery("update com.abcloan.LAD c set c.status =:status where c.cust1=:cust_id");
		        q2.setParameter("status", " Rejected");
		        q2.setParameter("cust_id", l2);
		        q2.executeUpdate();
		     
		        lic.info("Rejected");
	    }
	    }
	    else {
	    	
	    	 lic.info("No pending requests");
	    }
	    t.commit(); 
	    em.close();
	
	
		i=1;
		return i;
		 
}	 
		 
	}
	 

