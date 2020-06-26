
public class 오후퀴즈5{

	public static void main(String[] args){
		// for문
		int a7=0;
		int a9=0;
		for(int i=1; i<=1000; i++){
			if(i%7==0)
				a7+=i;
			if(i%9==0)
				a9+=i;
		}
		System.out.println("7의 배수 합:"+a7);
		System.out.println("9의 배수 합:"+a9);
		System.out.println("7의 배수+9의 배수:"+(a7+a9));
		System.out.println();
		
		// while문
		int i=1;
		a7=0;
		a9=0;
		while(i<=1000){
			if(i%7==0)
				a7+=i;
			if(i%9==0)
				a9+=i;
			i++;
		}
		System.out.println("7의 배수 합:"+a7);
		System.out.println("9의 배수 합:"+a9);
		System.out.println("7의 배수+9의 배수:"+(a7+a9));

	}

}
