package com.abcloan;

import com.abcloan.dao.AdminDAO;
import com.abcloan.dao.AdminDAOInterface;

import junit.framework.TestCase;

public class Junit extends TestCase {

	AdminDAOInterface obj;
	protected void setUp() throws Exception {
		super.setUp();
		obj=new AdminDAO();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		obj=null;
	}

	public void testCreateProfile() {
		int i=obj.createProfile();
		assert i>0 : "Test failed";
		//fail("Not yet implemented");
	}

	public void testDeleteProfile() {
		int i=obj.deleteProfile();
		assert i>0 : "Test failed";
		//fail("Not yet implemented");
	}

	/*public void testViewAllProfile() {
		Admin a=new Admin();
		a.setLoan_id(115);
		Admin ad=obj.viewAllProfile(a);
		//fail("Not yet implemented");
	}*/

	public void testUpdateProfile() {
		int i=obj.updateProfile();
		assert i>0 :"Test Failed";
		//fail("Not yet implemented");
	}

}
