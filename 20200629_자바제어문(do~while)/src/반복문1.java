//do~while��: �ݵ�� �� �� �̻��� ����
public class �ݺ���1{

	public static void main(String[] args){
		int i=1; //�������� i: Ƚ�� ����
		do {
			System.out.print(i);   //�ݺ� ���๮��
			System.out.print("�� "); //���� ���� ����
			i++; //i�� 5�� �ɶ����� ����
		}while(i<=5); //i=6
		
		System.out.println("\n====== while ======");
		i=1;
		while(i<=5) {
			System.out.print(i+"�� ");
			i++; //i=6
		}
		
		System.out.println("\n======= for =======");
		for(i=1;i<=5;i++) {
			System.out.print(i+"�� ");
		}
		
	}

}
