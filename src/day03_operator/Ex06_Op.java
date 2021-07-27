package day03_operator;

public class Ex06_Op {

	public static void main(String[] args) {
		
		/*
		 * 증감 연산자
		 * ++ 자기자신을 1 증가시킨다
		 * -- 자기 자신을 1 감소시킨다
		 * ex) a = a -1, 1을 뺴고 에이에 저장시켜라
		 *  a = a + 1 1을 더해서 에이에 저장시켜라
		 *  
		 *  
		 *  
		 */
		
		int su1 = 5;
		su1++;
		System.out.println(su1); //5에서 1증가
		//후치 또는 후위라고 쓰인다
		/*
		 * 단독젉으로 쓰일땐 상관없지만 같이 연산될땐 조금 달라진다
		 * 
		 */
		++su1;
		System.out.println(su1); //6에서 1증가
		//전치 또는 전위로 쓰인다
		
		
		int n1, n2, n3;
		n1 = 10;
		n2 = ++n1;
		n1 = 10;
		n3 = n1++;
		System.out.println(n2);
		//++가 앞에 있으면 어떠한 연산보다 자기자신이 우선시 된다
		System.out.println(n3);
		//모든 연산이 끝난 다음에 자기자신을 증가시킨다
		//그럼 나머지 더하기는 언제??
		
	}
	
}
