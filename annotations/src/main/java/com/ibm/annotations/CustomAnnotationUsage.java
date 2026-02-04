package com.ibm.annotations;

@CustomAnnotation(duration = 10, name = "Class", version=1.0)
public class CustomAnnotationUsage {
	@CustomAnnotation(duration = 4, name = "Constructor" )
	public CustomAnnotationUsage() {
		
	}
}
