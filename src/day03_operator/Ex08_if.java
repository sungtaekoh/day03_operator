package day03_operator;

import java.util.Scanner;

public class Ex08_if {

	public static void main(String[] args) {
		
		/*
		 * if문이란 제어문을 얘기한다
		 * 제어문 : 프로그램의 흐름을 제어한다
		 * if(조건식) {
		 * 주괄호 안의 내용은 if문의 종속 문장들이다.
		 * 조건식이 참인 경우 중괄호의 내용이 실행된다
		 *(참인경우 싫행 참이 아닌경우 실행을 하지 않는다)
		 * 
		 * }
		 */
//		예제
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("1. 쉬운게임");
		System.out.println("2. 어려운게임");
		System.out.println("3. 종료");
		System.out.println(">>> : ");
		num = input.nextInt();
		if(num ==1) {
			System.out.println("쉬운 게임 시작");
		}
		
		if(num ==2) {
			System.out.println("어려운 게임 시작");
			}
		
		if(num ==3)
//			System.out.println();
	}
