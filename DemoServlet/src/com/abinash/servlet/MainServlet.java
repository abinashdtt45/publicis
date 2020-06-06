package com.abinash.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abinash.customer.CustomerUtil;
import com.abinash.emp.EmployeeUtil;
import com.abinash.products.ProductUtil;

@WebServlet(urlPatterns = { "/MainServlet", "/getEmployees", "/getCustomers", "/getProducts" })
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ProductUtil product;
	private CustomerUtil customer;
	private EmployeeUtil employee;

	@Override
	public void init() throws ServletException {
		super.init();

		product = new ProductUtil();
		customer = new CustomerUtil();
		employee = new EmployeeUtil();

	}


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String uri = request.getRequestURI();
		String command = uri.substring(uri.lastIndexOf("/")+1);

		if(command == null)
			command = "";

		switch(command) {

		case "getProducts":
			listProducts(request, response);
			break;
		case "getCustomers":
			listCustomers(request, response);
			break;
		case "getEmployees":
			listEmployees(request, response);
			break;
		default:												// Hits if random url is entered
			homePage(request, response);
		}


	}


	private void listEmployees(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("EMPLOYEES", employee.getEmployees());


		RequestDispatcher dispatcher = request.getRequestDispatcher("employees.jsp");
		dispatcher.forward(request, response);
	}


	private void listCustomers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("CUSTOMERS", customer.getCustomers());
		RequestDispatcher dispatcher = request.getRequestDispatcher("customers.jsp");
		dispatcher.forward(request, response);

	}


	private void listProducts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("PRODUCTS", product.getProducts());
		RequestDispatcher dispatcher = request.getRequestDispatcher("products.jsp");
		dispatcher.forward(request, response);
	}

	private void homePage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String messaString = "Hi is the week 9 assignment.";
		request.setAttribute("message", messaString);
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		dispatcher.forward(request, response);
	}



}
