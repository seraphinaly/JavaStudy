/*    �迭 ����        ->  �迭 �ʱ�ȭ(�޸� �ȿ� �� ����)    ->  ���
      :�� �� ����?     	1.int[] arr={10,20,30,40,50}; :����� ���ÿ� �ʱⰪ �ο�
 					2.int[] arr=new int[5]; :�޸� ������ ����=>���߿� �� ä��
 					3.int[] arr;
 					  arr[0]=10; arr[1]=20; ...
 	    
 	    Ȱ��: ���(for, while)
 	    for=>����, for~each=>���
 */
public class �迭�ʱ�ȭ{

	public static void main(String[] args){
		String[] names= {"����â","���ϼ�","������","�ں�ȣ","�ڵ���"};
		
		System.out.println("== for-each==");	
		for(String name:names) { //���� �Ұ�: ȭ�� ��¸� ���
			System.out.println(name);
		}
		
		System.out.println("\n==== for ====");	
		for(int i=0;i<names.length;i++) {
			names[1]="������"; //�����Ͱ� ���� ����
			System.out.println(names[i]); //name[0]~name[4]
		}

	}
}
