//������ ���� 5�� ���� �� �ִ�/�ּҰ� ���ϴ� ���α׷�
public class �迭_�ִ��ּҰ�{

	public static void main(String[] args){
		int[] arr=new int[5]; //���� 5�� ������� �����
		
		for(int i=0;i<5;i++){
			arr[i]=(int)(Math.random()*100)+1; //���� 1~100 �� 5�� �迭�� ���
		}
	
		for(int i:arr) {
			System.out.print(i+" "); //���
		}
		System.out.println("\n===== ��� ======");
		int min=100;//�ּҰ� �������(���� ū ������ �ʱ�ȭ)
		int max=1;//�ִ밪 �������(���� ���� ������ �ʱ�ȭ)
		
		for(int i=0;i<5;i++) { 
			if(min>arr[i]) {   //arr[i]�� min���� ������
				min=arr[i];    //min���� arr[i]�� �ٲ�� 
			}	//�ּҰ�
		}
		
		for(int i=0;i<5;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}	//�ִ밪
		}
		System.out.println("�ּҰ�:"+min);
		System.out.println("�ִ밪:"+max);
		
	}

}
