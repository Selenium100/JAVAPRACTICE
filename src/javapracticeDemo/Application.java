package javapracticeDemo;

import java.util.ArrayList;

public class Application {
	public double getNumber(double d1,double d2) {
	double d=d1+d2;
	return d;
	}
	public ArrayList<String>  getDevicesList(String empName) {
		System.out.println("getting devices name for:"  +empName);
		ArrayList<String>devicesList=new ArrayList<String>();
		if(empName.equalsIgnoreCase("Rinky")) {
			devicesList.add("iphone13");
			devicesList.add("macbook");
			devicesList.add("Airtel Sim");

		}
		else if(empName.equalsIgnoreCase("Nitya")) {
			devicesList.add("samsung");
			devicesList.add("max bag");
			devicesList.add("jio Sim");

		}
		else if(empName.equalsIgnoreCase("kutu")) {
			devicesList.add("samsung 10");
			devicesList.add("van");
			devicesList.add("Sim 2");
		}
		else {
			System.out.println("empName is not found:"  +empName);
		}
		return devicesList;
	}
	
	

	public static void main(String[] args) {
    Application obj=new Application();
    ArrayList<String> s=obj.getDevicesList("Rinky");
    System.out.println(s);
    System.out.println("total number of devices:"  +s.size());

	}

}
