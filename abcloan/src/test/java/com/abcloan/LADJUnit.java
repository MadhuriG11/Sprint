package com.abcloan;

import com.abcloan.dao.LADDAO;

import junit.framework.TestCase;

public class LADJUnit extends TestCase {
     LADDAO obj;
	protected void setUp() throws Exception {
		super.setUp();
		obj=new LADDAO();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		obj=null;
	}

	//public void testViewAllVisitor() {
		//fail("Not yet implemented");
	//}

	public void testApproveloan() throws Exception {
		int i=obj.approveloan();
		assert i>0:"Test failed";
		//fail("Not yet implemented");
	}

}
