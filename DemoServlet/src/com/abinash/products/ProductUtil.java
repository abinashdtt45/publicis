package com.abinash.products;

import java.util.Arrays;
import java.util.List;

public class ProductUtil {

	public List<Product> getProducts(){
		return Arrays.asList(new Product(1, "Snacks"), new Product(2, "Vegetables"), new Product(3, "FMCG"),
				new Product(4, "OIL")
				);
	}
}
