package org.lang;

public class LanguageInfo extends StateDetails {

	private void tamilLanguage() {
		System.out.println("Dravidan Language");
	}

	private void hindiLanguage() {
		System.out.println("Ariyan Language");
	}

	private void englishLanguage() {
		System.out.println("British Language");
	}

	public static void main(String[] args) {
		LanguageInfo lang = new LanguageInfo();
		lang.southIndia();
		lang.northIndia();
		lang.tamilLanguage();
		lang.englishLanguage();
		lang.hindiLanguage();
	}

}
