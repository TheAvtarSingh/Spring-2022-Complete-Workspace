package org.ncu.springcoupling;

public class FactoryGreetingService {
//Crete the object
	public GreetingService getGreetingService(String lang) {
		if (lang.equals("English")) {
			return new EnglishGreetingService();
		}else if (lang.equals("French")) {
			return new FrenchGreetingService();
		}else if (lang.equals("Spanish")){
			return new SpanishGreetingService();
		}
	else if (lang.equals("Hindi")){
		return new HindiGreetingService();
	}
	else if (lang.equals("Japanese")){
		return new JapaneseGreetingService();
	}else {
			System.out.println("No language Found");
			throw new RuntimeException();
		
		}
	}
}
