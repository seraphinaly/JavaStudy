
public class �迭_�����߻�{

	public static void main(String[] args){
		
		int[] lotto=new int[6]; //6���� �޸𸮸� ���� �迭 'lotto' ����
		for(int i=0;i<lotto.length;i++){ //lotto[0]~lotto[5]��
			lotto[i]=(int)(Math.random()*45)+1; //1~45 ���� ����
		}
		for(int i:lotto){ //for~each(���� for��): �迭 ���
			System.out.print(i+" ");
		}
	
	}

}
