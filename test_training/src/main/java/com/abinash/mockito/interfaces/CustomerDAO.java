package com.abinash.mockito.interfaces;

import com.abinash.mockito.Customer;
import com.abinash.mockito.exceptions.DAOException;

public interface CustomerDAO {

	void addCustomer(Customer customer) throws DAOException;

}
