package day03_operator;

public class Ex05_Op {
	
	public static void main(String[] args) {
		/*
		 * �� ������
		 * �� �Ǵ� ������ ǥ��
		 * 
		 *���ƿ�����
		 * ||(or)// (����Ʈ + \�� ����Ѵ�) : �ϳ��� ���� �����ϸ� ����� ��  
		 * 
		 * true || false : true
		 * false || false : false
		 * (10 > 20) || (20 == 20) : true
		 * ���� �ִ� ���̴� ���� ���̴� �ϳ��� ���̳����� ���̴�
		 * 
		 * &&(and)���� ���� : ��ΰ� ���� �� ��, �ϳ��� ������ ������ ����
		   true && false : false
		   true && true : true
		   ( (10> 20) && (20 == 20) ) : false
		   
		   !(not) : ����� ���������ش�
		   !false : true �տ� ����ǥ�� ���̸� ����� �ٲ��
		   !true : false
		 */
		
		System.out.println(false || true);
		System.out.println(true || true);
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(!true); //������ ������ش� �� �տ� !�� �����ϱ� �����̴�
		
		
	}

}
