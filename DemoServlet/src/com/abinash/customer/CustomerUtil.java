package com.abinash.customer;

import java.util.Arrays;
import java.util.List;

public class CustomerUtil {

	public List<Customer> getCustomers(){
		return Arrays.asList(new Customer("Parosi Walein Bhaiya"), new Customer("Ms. Kavita Kaushik"),
				new Customer("Ms. Aaliya Bhatt"), new Customer("Mr. Abinash Dutta"));
	}
}
