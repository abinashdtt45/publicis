package com.abinash.mockito.interfaces;

import com.abinash.mockito.Customer;
import com.abinash.mockito.exceptions.DAOException;

public interface CustomerController {
	boolean customerApplication(Customer customer) throws DAOException;

}
