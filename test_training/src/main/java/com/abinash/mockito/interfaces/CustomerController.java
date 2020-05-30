package com.abinash.mockito.interfaces;

import com.abinash.mockito.Customer;
import com.abinash.mockito.exceptions.ControllerException;

public interface CustomerController {
	Customer customerApplication(Customer customer) throws ControllerException;

}
