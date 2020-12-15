package com.abcloan.dao;

import java.io.IOException;

public interface CustomerDAOInterface {
	public int searchAllProfile();
	public int apply() throws IOException;
	public int viewAllProfile();
}
