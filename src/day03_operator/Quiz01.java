package day03_operator;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args)   {
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("수입력 : ");
		num1 = input.nextInt();
		String s = (num1%2==0)?"짝수":"홀수";
		System.out.println(s);
	    s = (num1%3==0)?"3의 배수이다":"3의 배수가 아니다";
	    System.out.println(s);
		
		System.out.println("두 수 입력 : ");
		num2 = input.nextInt();
		num3 = input.nextInt();
      
	    System.out.println("num1 : "+num2+",num2 : "+num3);
	    String a = (num2 >= num3)? "num1가  num2 보다크다":"num2가 보다 num1 보다크다";
	    System.out.println(a);
	    
//	    System.out.println("num2 : " +num3);
	     
	    System.out.println();
	    
//	    System.in.read();
//	    System.in.read();

//	    System.out.println("num : "+ num2);
		
		
		
		
		
		
		
	}
	
	
}
