package FactoryDesignPattern;

public class OperatingSystemFactory {

	
	public OS getInstance(String str) {
		if(str.equals("Open")) {
			return new Android();
		}
		else if(str.equals("Closed")) {
			return new Windows();
		}
		else {
			return new IOS();
		}
	}
}
