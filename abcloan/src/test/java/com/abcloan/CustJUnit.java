package com.abcloan;

import java.io.IOException;

import com.abcloan.dao.CustomerDAO;


import junit.framework.TestCase;

public class CustJUnit extends TestCase {
     CustomerDAO obj;
	protected void setUp() throws Exception {
		super.setUp();
		obj=new CustomerDAO();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		obj=null;
	}

	public void testSearchAllProfile() {
		int i=obj.searchAllProfile();
		assert i>0: "Test failed";
		//fail("Not yet implemented");
	}

	public void testApply() throws IOException {
		int i=obj.apply();
		assert i>0: "Test failed";
		//fail("Not yet implemented");
	}
 public void testviewAllProfile() {
	 int i=obj.viewAllProfile();
	 assert i>0: "Test failed";
 }
}
