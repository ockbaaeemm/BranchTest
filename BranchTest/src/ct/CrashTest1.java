package ct;

public class CrashTest1 {

	public static void main(String[] args) {
		
		int x = 1;
		String y = "1";
		int c = 2;
		String d = "2";
		
		System.out.println("int x + String y = " + x + y);
		int c = 2;
		String d = "2";
		
		System.out.println("int c + String d = " + c + d);

	}

}
