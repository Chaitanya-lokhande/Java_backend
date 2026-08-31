package com.springcore.aopconcept.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectClass {

	@Before("execution(* com.springcore.aopconcept.service.PaymentServiceImple.makePayment())")
	public void printBefore() {
		System.out.println("Payment Started...");
	}
	
	@After("execution(* com.springcore.aopconcept.service.PaymentServiceImple.makePayment())")
	public void printAfter() {
		System.out.println("Payment successful..");
	}
	
}
