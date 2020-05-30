package com.abinash.mockito.interfaces;

import com.abinash.mockito.Customer;
import com.abinash.mockito.exceptions.DAOException;

public interface CustomerValidation {

	boolean checkLength(Customer customer) throws DAOException;

}
