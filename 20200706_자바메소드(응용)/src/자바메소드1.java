/*	5���� ������ ������ 
 *  5�� ���� �� SORT �� ����
 *          ====select
 *  �޼ҵ� �� �ݺ� ����/���� ����/�ϳ��� ��� ����       
 *          select{
 *          	����Ŭ ����* �� �޼ҵ� ó��
 *          	select ���� ����
 *          	����Ŭ �ݱ�* �� �޼ҵ� ó��
 *          }
 *          delete{
 *          	����Ŭ ����*
 *          	delete ���� ����
 *          	����Ŭ �ݱ�*
 *          }
 *          update{
 *          	����Ŭ ����*
 *          	update ���� ����
 *          	����Ŭ �ݱ�*
 *          }
 *          find{
 *          	����Ŭ ����*
 *          	find ���� ����
 *          	����Ŭ �ݱ�*
 *          }
 *          insert{
 *          	����Ŭ ����*
 *          	insert ���� ����
 *          	����Ŭ �ݱ�*
 *          }          
 */
public class �ڹٸ޼ҵ�1{
	static int[] sort(int[] arr,String type) {
		//sort
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(type.equals("ASC")) {					
					if(arr[i]>arr[j]){
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				if(type.equals("DESC")) {					
					if(arr[i]<arr[j]){
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args){
		// ȣ��
		int[] arr= {90,60,70,80,10,30,20,40,50}; //sort �� 10,20,30,40,50
		System.out.println("���� ��:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("\n���� ��:");
		int[] result=sort(arr,"ASC");
		for(int i:result) {
			System.out.print(i+" ");
		}
		System.out.println();
		result=sort(arr,"DESC");
		for(int i:result) {
			System.out.print(i+" ");	
		}
	}

}
