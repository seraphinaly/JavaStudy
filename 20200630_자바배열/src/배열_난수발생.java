
public class 배열_난수발생{

	public static void main(String[] args){
		
		int[] lotto=new int[6]; //6개의 메모리를 가진 배열 'lotto' 생성
		for(int i=0;i<lotto.length;i++){ //lotto[0]~lotto[5]는
			lotto[i]=(int)(Math.random()*45)+1; //1~45 사이 난수
		}
		for(int i:lotto){ //for~each(향상된 for문): 배열 출력
			System.out.print(i+" ");
		}
	
	}

}
