package day03_operator;

import java.util.Scanner;

public class Quiz01_tech {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.println("�� �Է� :");
		num1 =input.nextInt();
		String s;
		s = (num1%2 ==0)?"¦��":"Ȧ��";
		System.out.println(num1+"="+s);
		s = (num1%3 ==0)?"¦��":"Ȧ��";
//		System.out.println("3�� ���":"3�� ��� �ƴ�");
		System.out.println(num1+"="+s);
		System.out.println("�� �� �Է� : ");
		num1 = input.nextInt();
		num1 = input.nextInt();
//�� ������ ���߿� ����̺꿡�� ã�Ƽ� ���� ��������		
	}
	
}
