package javapracticeDemo;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		String browser = "opera";
		switch (browser) {
		case"chrome" :
			System.out.println("launch chrome");
			break;
		case"firefox" :
			System.out.println("launch firefox");
			break;
		case"safari" :
			System.out.println("launch safari");
			break;
		case"ie" :
			System.out.println("launch ie");
			break;

		default:
			System.out.println("please pass the right brower:"+browser);
			break;
		}
	}

}
