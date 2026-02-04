package com.ibm.spring;

import java.awt.TextArea;

import org.springframework.beans.factory.wiring.BeanConfigurerSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.spring.beans.BeanConfig;
import com.ibm.spring.beans.TextEditor;
import com.ibm.spring.services.OrderService;

public class Application
{
	public static void main( String[] args )
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
//		TextEditor textEditor = (TextEditor) context.getBean("textEditor");
//		textEditor.spellChecking();
//		if(context != null) {
//			context.registerShutdownHook();
//		}
//		
//		SpellChecker spellChecker1 = (SpellChecker)context.getBean("spellChecker1");
//		SpellChecker spellChecker2 = (SpellChecker)context.getBean("spellChecker1");
//		SpellChecker spellChecker3 = (SpellChecker)context.getBean("spellChecker1");
		
//		JavaCollection jc = (JavaCollection)context.getBean("javaCollection");
//		System.out.println("List Address");
//		
//		List<String> listAddress = jc.getAddressList();
//		listAddress.forEach(System.out::println);
//		jc.getAddressSet();
//		jc.getAddressMap();
//		jc.getAddressProp();
//		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		OrderService orderService = (OrderService)context.getBean("orderService");
		orderService.makePayment(1230.50);
		System.out.println("The End");
	}
}