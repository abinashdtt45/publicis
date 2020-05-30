package com.abinash.mockito.dao;

import com.abinash.mockito.Customer;
import com.abinash.mockito.exceptions.DAOException;
import com.abinash.mockito.interfaces.CustomerDAO;

public class CustomerDAOImpl implements CustomerDAO {

	public void addCustomer(Customer customer) throws DAOException {
		System.out.println("The customer has been added success fully");

	}

}
