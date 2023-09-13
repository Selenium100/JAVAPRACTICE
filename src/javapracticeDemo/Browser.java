package javapracticeDemo;

public class Browser {
	public boolean launchBrowser(String brName) {
		System.out.println("launchig browser:" +brName);
		switch (brName.toLowerCase()) {

		case "chrome":
			System.out.println("chrome is launched");
		
			return true;
		case "ff":
			System.out.println("ff is launched");
			return true;

		case "safari":
			System.out.println("safari is launched");
			return true;

			

		default:
			System.out.println("plz pass the right browser......"  +brName);
			return true;

		}
		
	}
	public static void main(String[] args) {
		
		Browser obj=new Browser();
		boolean flag=obj.launchBrowser("chrome");
		System.out.println(flag);
		

	}

}
