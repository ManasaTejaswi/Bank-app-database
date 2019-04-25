package com.bank.daotest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capg.bank.bean.CustomerDetails;
import com.capg.bank.dao.TransactionDaoImpl;

class TransactionDaoImplTest {

	@Test
	void testWithdraw() throws Exception {
		TransactionDaoImpl trans=new TransactionDaoImpl();
		CustomerDetails cust=new CustomerDetails();
		cust.setBalance(100);
		cust.setAccountNo(1111100001);
		float cust1=trans.withdraw(200,1111100001, cust);
		
		AssertEquals(0,trans.withdraw(100, 1111100001, cust));
		//assertEquals(100,1111100001,trans.withdraw(100, 1111100001));
		
	}

	private void AssertEquals(int i, float f) {
		// TODO Auto-generated method stub
		
	}

	

	@Test
	void testDeposit() throws Exception {
		TransactionDaoImpl trans=new TransactionDaoImpl();
		CustomerDetails cust=new CustomerDetails();
		cust.setBalance(100);
		cust.setAccountNo(1111100001);
		float cust1=trans.deposit(200,1111100001, cust);
		
		AssertEquals(0,trans.deposit(100, 1111100001, cust));
		
	}

	

}


	


