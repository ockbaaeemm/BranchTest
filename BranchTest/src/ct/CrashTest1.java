package ct;

import java.util.Scanner;

public class CrashTest1 {

	public static void main(String[] args) {
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0; i<73; i++) {
			
			sum1 += i;
			
		}
		
		for(int x=0; x<100; x++) {
					
					sum2 += x;
					
				}
		
		System.out.println("Pattern A");
		for (int a=0; a<6; a++) {
			for (int b=0; b<=a; b++) {
			System.out.print("* ");
			}
			System.out.println();
		}
        System.out.println();   
		
		System.out.println("Pattern B");
		for (int a=0; a<=5; a++) {
			for (int b=5; b>=a; b--) {
			System.out.print("* ");
			}
			System.out.println();
	}
		System.out.println(); 
		
		System.out.println("Pattern C");
		for (int a=0; a<6; a++) {
			for (int b=0; b<6; b++) {
			if ((a+b) >=5 ) {
			System.out.print("* ");
			} else {
			  System.out.print("  ");
			}
		}
			System.out.println();			
	}
		System.out.println();   
		
		System.out.println("Pattern D");
		for (int a=0; a<6; a++) {
			for (int b=0; b<=6; b++) {
			if (a >= b) {
			System.out.print("  ");
			} else {
			  System.out.print("* ");
			}
		}
			System.out.println();
			
		}
		
		
		
		System.out.println("합계 1 : " + sum1);
		
		System.out.println("합계 1 : " + sum2);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("4개의 값을 입력하세요 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		
		
	
		
		if (num1==num2 && num2==num3 && num3==num4) {
			System.out.println("4개 정수값이 동일합니다");
		}			
	   else {
		    System.out.println("4개의 정수값이 동일하지 않습니다");
	   }

	}

}
