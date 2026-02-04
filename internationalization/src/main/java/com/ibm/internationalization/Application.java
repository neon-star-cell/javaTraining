package com.ibm.internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class Application
{
	public static void main( String[] args )
	{
//		double d = 12345.567;
//		NumberFormat nf_us = NumberFormat.getInstance(Locale.US);
//		NumberFormat nf_it = NumberFormat.getInstance(Locale.ITALY);
//		NumberFormat nf_fr = NumberFormat.getInstance(Locale.FRANCE);
//		
//		System.out.println("Italy " + d + " : " + nf_it.format(d));
//		System.out.println("US " + d + " : " + nf_us.format(d));
//		System.out.println("France " + d + " : " + nf_fr.format(d));
		
		Locale defaultLocale = new Locale("es");
		System.out.println(defaultLocale);
		System.out.println("Default Locale:");
		System.out.println("Language: " + defaultLocale.getLanguage());
		System.out.println("Country: " + defaultLocale.getCountry());
		System.out.println("Display Name: " + defaultLocale.getDisplayName());
		System.out.println("Variant: " + defaultLocale.getVariant());
		
		ResourceBundle resourceBundle = ResourceBundle.getBundle("Messages", defaultLocale);
		
		System.out.println("English:");
		printMessages(resourceBundle);
	}
	
	private static void printMessages(ResourceBundle bundle) {
		System.out.println("Greeting: " + bundle.getString("greeting"));
		System.out.println("Greeting: " + bundle.getString("question"));
		System.out.println("Greeting: " + bundle.getString("farewell"));
	}
}