package com.abinash.mockito.service;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.abinash.mockito.Customer;
import com.abinash.mockito.dao.CustomerDAOImpl;
import com.abinash.mockito.exceptions.DAOException;

public class CustomerValidationImplTest {

	@Mock
	CustomerDAOImpl dao;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void checking_Whether_Customer_created_sucessfully() throws DAOException {
		CustomerValidationImpl validationImpl = new CustomerValidationImpl();
		validationImpl.setDaoImpl(dao);

		Customer customer = new Customer();
		when(dao.addCustomer(customer)).thenReturn(new Boolean(true));
		boolean result = validationImpl.checkLength(customer);
		assertTrue(result);
		verify(dao).addCustomer(customer);
	}

}
