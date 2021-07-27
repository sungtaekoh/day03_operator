package day03_operator;

import java.util.Scanner;

public class Quiz02 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
//	입력한 데이터가 3의 배수인 경우 출력하시오	
		
		  int num1;
		
		System.out.println("첫번째 수 입력 : ");
		num1 = input.nextInt();
		if(num1%3 == 0 )
			System.out.println(num1);
		
		
		
		//입력한 수의 절대값을 구하는 프로그램을 작성하시오
		
		int D;
		
		System.out.println("두번째 수 입력 : ");
		D = input.nextInt();
		if(D < 0)
			System.out.println(D * (-1));
		if(D > 0)
			System.out.println(D);
		
	//		System.out.println((111) * (-1)); //음수*음수=양수 양수*음수=음수
		
		
		//두 수를 입력 받아 큰 수를 출력 하시오
		int num3;
		int num4;
		System.out.println("세번째 수 입력");
		num3 = input.nextInt();
		num4 = input.nextInt();
		if(num3 > num4)
			System.out.println(num3);
		if(num4 > num3)
			System.out.println(num4);
		
		
		
		
		//세수를 입력받아 큰 수를 출력하시오
		int num5;
		int num6;
		int num7;
		System.out.println("네번째 수 입력 : ");
		num5 = input.nextInt();
		num6 = input.nextInt();
		num7 = input.nextInt();
		if(num5 > num6 && num5 > num7)
		System.out.println(num5);
		if(num6 > num5 && num6 > num7)
			System.out.println(num6);
		if(num7 > num6 && num7 > num5)
			System.out.println(num7);
			
		
		
		
		//두 수를 입력 받아 큰 수가 짝수이면 출력하시오
		int num8;
		int num9;
		System.out.println("다섯번째 수 입력 : ");
		num8 = input.nextInt();
		num9 = input.nextInt();
		if(num8 > num9 && num8%2 == 0)
		System.out.println(num8);
		
		if(num9 > num8 && num9%2 == 0)
		System.out.println(num9);
		
		
		
		//두 수를 입력받아 합이 짝수이고 3의 배수인 수를 출력하시오
		int A;
		int B;
		
		System.out.println("여섯번째 수 입력 : ");
		A = input.nextInt();
		B = input.nextInt();
		int C = A + B;
		if(C%2 ==0 && C%3 ==0)
			System.out.println(C);
		
		
		
		
		
		
		
		/*
		 *절대 값: 부호가 없는 수
		 음수가 아닌 수 즉 양수 
		 */
		
	}

}
