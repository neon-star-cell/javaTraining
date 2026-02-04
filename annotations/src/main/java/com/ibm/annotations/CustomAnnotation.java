package com.ibm.annotations;

public @interface CustomAnnotation {
	String name();
	int duration();
	double[] version() default {1.0, 2.0, 3.0, 4.0, 5.0};
}
