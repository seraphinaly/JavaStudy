
public class �迭_�󵵼����{

	public static void main(String[] args){
		int[] arr=new int[10]; //10�ڸ�: 0~9 �����߻� ��ų��
		int[] count=new int[10];

		//�ʱⰪ
		for(int i=0; i<arr.length; i++){
			arr[i]=(int)(Math.random()*10); //arr[i]�� 0~9 �� �ϳ�
		}

		//��� => �󵵼� ����� ������
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println("\n========���========");
		for(int i=0; i<arr.length; i++){  
			count[arr[i]]++;  //arr[i]=0~9, count[0~9]�� 1 �������Ѷ�
		}
		//���
		for(int i=0; i<arr.length; i++){
			if(count[i]!=0){ //count�� 0�� �ƴϸ� ���
				System.out.println(i+"�� ����:"+count[i]);
			}
		}

	}
}