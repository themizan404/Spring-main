package com.mizan.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mizan.aop.dao.AccountDAO;
import com.mizan.aop.dao.MembershipDAO;

public class MainApp {

	public static void main(String[] args) {
		// read spring config java class
		ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		// get membership bean from spring container
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

		// get the business method
		theAccountDAO.AddAccount();
//		// do it again!
//		System.out.println("\n let's call it again!\n");
//
//		// call the bussiness method again
//		theAccountDAO.AddAccount();

		// call the membership business method
		theMembershipDAO.AddAccount();

	}

}
