
public class ���ڿ�1_for_forEach{
	//���� 5�� �����ؼ� ��ճ���
	public static void main(String[] args){
		
		//1.for:���� 5�� �����ϴ� �޸� ���� ����(���������� ���)
		int[] arr={30,50,70,90,10};

		int total=0;
		for(int i=0;i<5;i++) {
			total+=arr[i];//total=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		}
		System.out.println("����� ������ ���:"+total/5.0);
		
		//2.���� for
		total=0;
		for(int i:arr) {
			total+=i;
		}
		System.out.println("����� ������ ���:"+total/5.0);
		
		
		}
}
