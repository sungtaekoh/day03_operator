package day03_operator;

import java.util.Scanner;

public class Quiz01_tech {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.println("수 입력 :");
		num1 =input.nextInt();
		String s;
		s = (num1%2 ==0)?"짝수":"홀수";
		System.out.println(num1+"="+s);
		s = (num1%3 ==0)?"짝수":"홀수";
//		System.out.println("3의 배수":"3의 배수 아님");
		System.out.println(num1+"="+s);
		System.out.println("두 수 입력 : ");
		num1 = input.nextInt();
		num1 = input.nextInt();
//다 못적음 나중에 드라이브에서 찾아서 보고 공부하자		
	}
	
}
