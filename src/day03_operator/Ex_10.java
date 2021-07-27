package day03_operator;

import java.util.Scanner;

public class Ex_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력 :");
		num = input.nextInt();
		if(num%2 ==0) {
			System.out.println("짝수");
		}
		if(num%2 != 0) {
			System.out.println("홀수");
			//if문 자주 사용한다
			
		}
	}
}
