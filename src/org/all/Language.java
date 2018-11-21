package org.all;

import org.english.English;


public class Language extends English{
	public void allLanguage() {
		System.out.println("All Language");

	}
	public static void main(String[] args) {
		Language lang = new  Language();
		lang.allLanguage();
		lang.EnglishLanguage();
		lang.TamilLanguage();
		lang.TelguLanguage();
	}
}
