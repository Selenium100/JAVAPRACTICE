package javapracticeDemo;

public class JavaNarowingTypecast {

	public static void main(String[] args) {
		long l = 100;
		int i = (int)l;
		short s = (short)i;
		byte b = (byte)s;
		System.out.println(s);

	}

}
