package day03_operator;

public class Ex07_Op {
	
	public static void main(String[] args) {
		/*
		 * ���� ������ (���ǿ�����)
		 * ���� = (��)?(���ΰ��) : (������ ���);
		 *
		 */
		int su = 8;
		String s = (su%2 == 0 )?"¦��":"Ȧ��";
		System.out.println(s);
		//�ش��ϴ� ���̴ϱ� ������� s�� ���´�
		
		su = 9;
		s = (su%2 == 0 )?"¦��":"Ȧ��";
		System.out.println(s);
		
		
	}

}
