package com.abinash.mockito.service;

import com.abinash.mockito.Customer;
import com.abinash.mockito.dao.CustomerDAOImpl;
import com.abinash.mockito.exceptions.DAOException;
import com.abinash.mockito.interfaces.CustomerValidation;

public class CustomerValidationImpl implements CustomerValidation {

	private CustomerDAOImpl daoImpl;

	public boolean checkLength(Customer customer) throws DAOException {
		String nameString = customer.getNameString();
		if (nameString.length() < 4) {
			return false;
		}
		try {
			boolean result = daoImpl.addCustomer(customer);
			if(result == false) {
				return false;
			}
		} catch (DAOException e) {
			throw new DAOException();
		}
		return true;

	}

	public CustomerDAOImpl getDaoImpl() {
		return daoImpl;
	}

	public void setDaoImpl(CustomerDAOImpl daoImpl) {
		this.daoImpl = daoImpl;
	}

}
