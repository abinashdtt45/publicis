package com.abinash.mockito.controller;

import com.abinash.mockito.Customer;
import com.abinash.mockito.exceptions.DAOException;
import com.abinash.mockito.interfaces.CustomerController;
import com.abinash.mockito.service.CustomerValidationImpl;

public class CustomerControllerImpl implements CustomerController {

	private CustomerValidationImpl validate;

	public boolean customerApplication(Customer customer) throws DAOException {
		try {
			boolean result = validate.checkLength(customer);
			if (result == false) {
				return false;
			}
		} catch (DAOException e) {
			throw new DAOException();
		}
		return true;
	}

	public CustomerValidationImpl getValidate() {
		return validate;
	}

	public void setValidate(CustomerValidationImpl validate) {
		this.validate = validate;
	}

}
