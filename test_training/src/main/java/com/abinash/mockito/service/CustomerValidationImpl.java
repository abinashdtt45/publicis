package com.abinash.mockito.service;

import com.abinash.mockito.Customer;
import com.abinash.mockito.dao.CustomerDAOImpl;
import com.abinash.mockito.exceptions.DAOException;
import com.abinash.mockito.interfaces.CustomerValidation;

public class CustomerValidationImpl implements CustomerValidation {

	private CustomerDAOImpl daoImpl;

	public boolean checkLength(Customer customer) throws DAOException {
		try {
			String nameString = customer.getNameString();
			if (nameString.length() < 4) {
				return false;
			} else {
				daoImpl.addCustomer(customer);
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
