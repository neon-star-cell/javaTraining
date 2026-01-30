package com.ibm.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.spring.beans.TextEditor;

public class Application
{
	public static void main( String[] args )
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		TextEditor textEditor = (TextEditor) context.getBean("textEditor");
		textEditor.spellChecking();
		if(context != null) {
			context.close();
		}
//		
//		SpellChecker spellChecker1 = (SpellChecker)context.getBean("spellChecker1");
//		SpellChecker spellChecker2 = (SpellChecker)context.getBean("spellChecker1");
//		SpellChecker spellChecker3 = (SpellChecker)context.getBean("spellChecker1");
	}
}