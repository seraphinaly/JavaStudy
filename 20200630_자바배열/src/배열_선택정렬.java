
public class �迭_��������{

	public static void main(String[] args){
		/* DESC(��������) 50 40 30 20 10 
		 * ASC(��������) 10 20 30 40 50
		 * 
		 * ex)�������� 
		 * 1.��������: �� ó�� ����, �� ���������� ��. => (n-1)�� ����
		 * 2.��������: �� ������ ����, �� �ڸ��� ��(p.203)
		 */
		
		int[] arr={0, 10, 40, 20, 50}; //ASC =>DESC

		System.out.println("���� ��:");
		for(int i:arr){
			System.out.print(i+" ");
		}
		//���� ����
		//��������(ASC)
		System.out.println("\n�������� ���� ��:");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {   
					int tmp=arr[i];  //������ ���� �ٲܶ��� tmp�� �̸� �� 1�� �Űܳ���!
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		
		//��������(DESC)
		System.out.println("\n�������� ���� ��:");
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){ //j:���ϴ� ����, i��°�� ������=>i+1
				if(arr[i]<arr[j]){   //���� DESC, �ε�ȣ ���� '>' : ASC
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		for(int i:arr){
			System.out.print(i+" ");
		}

	}

}
