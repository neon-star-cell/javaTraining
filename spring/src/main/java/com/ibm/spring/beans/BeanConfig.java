package com.ibm.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	@Bean("textEditor")
	public TextEditor getTextEditor() {
		return new TextEditor();
	}
	
	@Bean
	public SpellChecker getSpellChecker() {
		return new SpellChecker();
	}
}
