package com.springcore.aopconcept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.aopconcept.service.PaymentService;
import com.springcore.aopconcept.service.PaymentServiceImple;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/aopconcept/config.xml");
        PaymentService paymentService = context.getBean(PaymentServiceImple.class);
        
        paymentService.makePayment();
    }
}
