package com.abinash.mockito.dao;

import com.abinash.mockito.Customer;
import com.abinash.mockito.exceptions.DAOException;
import com.abinash.mockito.interfaces.CustomerDAO;

public class CustomerDAOImpl implements CustomerDAO {

	public boolean addCustomer(Customer customer) throws DAOException {
		if ("connection not done successfully" != null) {
			return false;
		}
		return true;
	}

}
