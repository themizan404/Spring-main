package com.mizan.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void AddAccount() {
		System.out.println(getClass() + ": Doing MY DB: ADDING ");
	}
}
