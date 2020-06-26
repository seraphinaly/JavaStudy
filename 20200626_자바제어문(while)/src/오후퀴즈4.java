
public class 오후퀴즈4 {

	public static void main(String[] args) {
      //for문
		int i=0;
		for(i=1; i<=100; i++){
			if(i%3==0 && i%5==0)
				System.out.print(i+" ");
		}

		System.out.println();
		
	  //while문
		i=1;
		while(i<=100){
			if(i%3==0 && i%5==0)
				System.out.print(i+" ");
			i++;
		}

	}

}
