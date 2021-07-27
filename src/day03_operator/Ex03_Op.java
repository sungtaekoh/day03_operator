package day03_operator;

public class Ex03_Op {
	public static void main(String[] args) {
		/*
		 * 복합 대입 연산자
		 * a = 10;
		 * a(13) = a(10) + 3; -> a+=  2;
		 * 오른쪽의 내용처럼 줄여서 사용할 수 있다
		 * 이러한게 복합 대입 연산자 이다
		 * 
		 * a = a * 3; -> a*= 3;
		 * ...
		 * 
		 */
//	먼저 생각해보고 생간한대로 출력이 되는지 확인해보기
		int su1, su2;
		su1 = su2 = 5;
//		su1 6 = su1 5 +1
		System.out.println( "su1 + 1 = " + (su1 +=1) );

//		su1 5 = su1 6 -1
		System.out.println( "su1 - 1 = " + (su1-=1) );

//		su1 25 = su1 5 * su2 5
		System.out.println( "su1 * su2 = " + (su1 *= su2) );
//      su1 5 = su1 25 / su2 5
		System.out.println( "su1 / su2 = " + (su1 /= su2) );
		
//		su1 0 = su1 5 % su2 5
		System.out.println( "su1 % su2 = " + (su1 %= su2) );
		
		
		
	
	
	}
	
	

}
