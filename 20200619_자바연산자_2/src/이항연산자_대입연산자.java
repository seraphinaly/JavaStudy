
public class 이항연산자_대입연산자 {
    
	public static void main(String[] args) {
      //복합대입연산자
		//1씩 증가 => a++/++a(증가연산자)/ a+=1 / a=a+1
		//3씩 증가 => a+=3 : 원하는 개수만큼 증가시킬 수 있음
		int a=10;
		System.out.println(a+=2); //a에 2를 더해라 -> 12
		
		a=10;
		System.out.println(a-=5); //5
		
		int c=10;
		c=c*5; //c*=5와 같은 코딩
		System.out.println("c="+c); //c=50
		
		int d=10;
		d/=3;
		System.out.println("d="+d); //d=3
     }

}
