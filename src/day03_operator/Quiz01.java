package day03_operator;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args)   {
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("���Է� : ");
		num1 = input.nextInt();
		String s = (num1%2==0)?"¦��":"Ȧ��";
		System.out.println(s);
	    s = (num1%3==0)?"3�� ����̴�":"3�� ����� �ƴϴ�";
	    System.out.println(s);
		
		System.out.println("�� �� �Է� : ");
		num2 = input.nextInt();
		num3 = input.nextInt();
      
	    System.out.println("num1 : "+num2+",num2 : "+num3);
	    String a = (num2 >= num3)? "num1��  num2 ����ũ��":"num2�� ���� num1 ����ũ��";
	    System.out.println(a);
	    
//	    System.out.println("num2 : " +num3);
	     
	    System.out.println();
	    
//	    System.in.read();
//	    System.in.read();

//	    System.out.println("num : "+ num2);
		
		
		
		
		
		
		
	}
	
	
}
