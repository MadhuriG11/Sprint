package com.abcloan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Logger;
 import com.abcloan.dao.*;

public class App {
	

	
	
	
	
    public static void main(String[] args)throws Exception {
        final Logger lic=Logger.getLogger(App.class.getName());
      
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String ss="y";
		while(ss.contentEquals("y")) {
        CustomerDAOInterface t = new CustomerDAO();
        AdminDAOInterface z = new AdminDAO();
        LADDAOInterface l=new LADDAO();
        lic.info("WELCOME to ABC bank");
    
        lic.info("Press 1 if you are a CUSTOMER");
        lic.info("Press 2 if you are an ADMIN");
        lic.info("Press 3 if you are from LAD");
        String s=br.readLine();
        long choice=Long.parseLong(s);
        String str="y";
        if(choice==1) {
        	while(str.contentEquals("y")) {
        		 lic.info("****Options for Customer****");
        		 lic.info("Press 3 to view Loan schemes");
        		 lic.info("Press 1 to search Loan schemes ");
        		 lic.info("Press 2 to Apply for loan");
        	
        	String ch=br.readLine();
        	int i=Integer.parseInt(ch);
        	switch(i) {
        		case 3:
        			t.viewAllProfile();
        			break;
        		case 1:
        			t.searchAllProfile();
        			break;
        		case 2:
        			t.apply();
        			break;
        		
        			
        		default:
        			lic.info("Please select a valid option");
        			break;
        	}
        	 lic.info("Do you want to continue as an customer(y/n)");
        	str=br.readLine();
          }
        }
        else if(choice==2) {
        	while(str.contentEquals("y")) {
        		 lic.info("****Options for Admin****");
        		 lic.info("Press 1 to add loan schemes");
        		 lic.info("Press 2 to delete loan schemes");
        		 lic.info("Press 3 to update loan schemes");
        		 lic.info("Press 4 to view all loan schemes");
            	
            	String ch=br.readLine();
            	int i=Integer.parseInt(ch);
            	switch(i) {
            		case 1:
            			z.createProfile();
            			
            			break;
            		case 2:
            			z.deleteProfile();
            			break;
            		case 3:
            			z.updateProfile();
            			break;
            		case 4:
            			z.viewAllProfile();
            		
            			
            		default:
            			lic.info("Please select a valid option");
            			break;	
            }
          }
        	 lic.info("Do you want to continue as an admin(y/n)");
        }
        
        else if(choice==3) {
        	while(str.contentEquals("y")) {
        		 lic.info("****Options for LAD****");
            	 lic.info("Press 1 to view applications");
            	 lic.info("Press 2 to approve/reject application");
            	
            	
            	String ch=br.readLine();
            	int i=Integer.parseInt(ch);
            	switch(i) {
            		case 2:
            			l.approveloan();
            			break;
            		
            		case 1:
            			l.viewAllVisitor();
            			break;
            		
            			
            		default:
            			 lic.info("Please select a valid option");
            			break;	
            	}
        	}
        	
        }
        else {
        	 lic.info("PLease enter a valid choice");
        	
        }
        lic.info("Do you want to continue(y/n)");
        	ss=br.readLine();
	  }
        	
        }
    
    	
    	
    
    	
    	
		
    	
    
    }


