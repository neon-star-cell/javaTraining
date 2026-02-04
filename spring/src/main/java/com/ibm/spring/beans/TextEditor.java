package com.ibm.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("textEditor")
public class TextEditor {
	private SpellChecker spellChecker;

	public TextEditor() {
		System.out.println("Inside TextEditor no-args constructor");
	}
	
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor");
		this.spellChecker = spellChecker;
	}
	
	public void init() {
		System.out.println("Text Editor initialized");
	}
	
	public void destroy() {
		System.out.println("Text Editor Destroyed");
	}

	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public void spellChecking() {
		this.spellChecker.checkSpelling();
	}
}
