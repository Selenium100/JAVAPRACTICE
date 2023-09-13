package javapracticeDemo;

public class ApplicationSystem {
	String name;
	int pages;
	String url;
	public ApplicationSystem(String name, int pages, String url) {
		this.name = name;
		this.pages = pages;
		this.url = url;
	}
	
	public int getPageCount(String appName) {
		switch (appName) {
		case "Amazon" :
			return this.pages;
		case "flipcart" :
			return this.pages;
		case "myntra" :
			return this.pages;
		default:
			System.out.println("psge not found");
		}
		return -1;
	}
	
	

}
