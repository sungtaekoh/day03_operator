package day03_operator;

import java.util.Scanner;

public class Quiz02 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
//	�Է��� �����Ͱ� 3�� ����� ��� ����Ͻÿ�	
		
		  int num1;
		
		System.out.println("ù��° �� �Է� : ");
		num1 = input.nextInt();
		if(num1%3 == 0 )
			System.out.println(num1);
		
		
		
		//�Է��� ���� ���밪�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
		
		int D;
		
		System.out.println("�ι�° �� �Է� : ");
		D = input.nextInt();
		if(D < 0)
			System.out.println(D * (-1));
		if(D > 0)
			System.out.println(D);
		
	//		System.out.println((111) * (-1)); //����*����=��� ���*����=����
		
		
		//�� ���� �Է� �޾� ū ���� ��� �Ͻÿ�
		int num3;
		int num4;
		System.out.println("����° �� �Է�");
		num3 = input.nextInt();
		num4 = input.nextInt();
		if(num3 > num4)
			System.out.println(num3);
		if(num4 > num3)
			System.out.println(num4);
		
		
		
		
		//������ �Է¹޾� ū ���� ����Ͻÿ�
		int num5;
		int num6;
		int num7;
		System.out.println("�׹�° �� �Է� : ");
		num5 = input.nextInt();
		num6 = input.nextInt();
		num7 = input.nextInt();
		if(num5 > num6 && num5 > num7)
		System.out.println(num5);
		if(num6 > num5 && num6 > num7)
			System.out.println(num6);
		if(num7 > num6 && num7 > num5)
			System.out.println(num7);
			
		
		
		
		//�� ���� �Է� �޾� ū ���� ¦���̸� ����Ͻÿ�
		int num8;
		int num9;
		System.out.println("�ټ���° �� �Է� : ");
		num8 = input.nextInt();
		num9 = input.nextInt();
		if(num8 > num9 && num8%2 == 0)
		System.out.println(num8);
		
		if(num9 > num8 && num9%2 == 0)
		System.out.println(num9);
		
		
		
		//�� ���� �Է¹޾� ���� ¦���̰� 3�� ����� ���� ����Ͻÿ�
		int A;
		int B;
		
		System.out.println("������° �� �Է� : ");
		A = input.nextInt();
		B = input.nextInt();
		int C = A + B;
		if(C%2 ==0 && C%3 ==0)
			System.out.println(C);
		
		
		
		
		
		
		
		/*
		 *���� ��: ��ȣ�� ���� ��
		 ������ �ƴ� �� �� ��� 
		 */
		
	}

}
