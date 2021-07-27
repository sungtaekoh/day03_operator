package day03_operator;

public class Ex05_Op {
	
	public static void main(String[] args) {
		/*
		 * 논리 연산자
		 * 참 또는 거짓을 표현
		 * 
		 *오아연산자
		 * ||(or)// (쉬프트 + \로 사용한다) : 하나라도 참이 존재하면 결과는 참  
		 * 
		 * true || false : true
		 * false || false : false
		 * (10 > 20) || (20 == 20) : true
		 * 앞의 있는 식이던 뒤의 식이던 하나라도 참이나오면 참이다
		 * 
		 * &&(and)엔드 연산 : 모두가 참일 때 참, 하나라도 거짓이 잇으면 거짓
		   true && false : false
		   true && true : true
		   ( (10> 20) && (20 == 20) ) : false
		   
		   !(not) : 결과를 반전시켜준다
		   !false : true 앞에 느낌표를 붙이면 결과가 바뀐다
		   !true : false
		 */
		
		System.out.println(false || true);
		System.out.println(true || true);
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(!true); //반전을 만들어준다 참 앞에 !가 있으니까 거짓이다
		
		
	}

}
