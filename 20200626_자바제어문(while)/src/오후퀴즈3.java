
public class ��������3 {

	public static void main(String[] args) {
  	  //for��
		int odd=0; int even=0;
		for(int i=1;i<=30;i++) {
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		}
		System.out.println("¦����:"+even);
		System.out.println("Ȧ����:"+odd);
		
		System.out.println();
		
	  //while��
		int i=1; odd=0; even=0;
		while(i<=30) {
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		i++;	
		}
		System.out.println("¦����:"+even);
		System.out.println("Ȧ����:"+odd);
		
	}

}
