/* ���� Scope
     1. ��������
     2. �������
     3. ��������
    
     public class A {
      	int a; �������=> class A�� ����� ������ ����
      	static int b; ��������=> JVM�� class�� �ε��� ��
      	==========================================
		public static void main(String[] args) {
			int c; ��������=> main��� �ȿ����� ��� ����
		}	
 */
public class ����������{

	public static void main(String[] args){
		//		int i=2;
		//		for(i=2; i<=10; i++){
		//			System.out.println("i="+i);
		//		} //i�� ����
		//		System.out.println("i="+i);
		//		System.gc(); //�޸� ȸ��(������ �÷���)

		
		int i=1;
	  //for��
		for(i=1; i<=5; i++){
			System.out.print(i+" ");
		}
		System.out.println();

	  //while��  
		i=1;
		while(i<=5){
			System.out.print(i+" ");
			i++;
		}
		System.out.println();

	  //do~while��  
		i=1;
		do{
			System.out.print(i+" ");
			i++;
		} while(i<=5);

	}
}
