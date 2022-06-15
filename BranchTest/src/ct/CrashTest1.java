package ct;

public class CrashTest1 {

	public static void main(String[] args) {
		
		int a = 1;
		String y = "1";
		int b = 2;
		String d = "2";
		
		System.out.println("int x + String y = " + a + y);
		
		System.out.println("int c + String d = " + b + d);
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0; i<73; i++) {
			
			sum1 += i;
			
		}
		
		for(int x=0; x<100; x++) {
					
					sum2 += x;
					
				}
		
		System.out.println("합계 1 : " + sum1);
		
		System.out.println("합계 1 : " + sum2);

	}

}
