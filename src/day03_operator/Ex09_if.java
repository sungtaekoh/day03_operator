package day03_operator;

import java.util.Scanner;

public class Ex09_if {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		if(num > 10) //해당조건이 참이면 밑의 내용을 종속문장으로 본다
		System.out.println("종속 문장 실행");//종속문장이 다 되면 다음문장으로 간다
		//만약 해당 문장이 거짓이면 해당 종속문장은 실행되지 않는다 바로 다음문장으로 간다
		//하나의 문장만 종속 나머진 다음 문장/ 모든 문장을 종속으로 하고싶으면 중괄호를 사용한다
		System.out.println("다음 문장들 실행");
		System.out.println("1종속 문장 실행");
		System.out.println("2종속 문장 실행");
		System.out.println("3종속 문장 실행");
		System.out.println("4종속 문장 실행");
		System.out.println("5종속 문장 실행");
		System.out.println("6종속 문장 실행");
		System.out.println("7종속 문장 실행");
		
		/*
		 * 
		 * 
		 * 
		 */
		
		
	}

}
