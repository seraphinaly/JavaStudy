
public class 선택문5_지역변수 {
    //여기서 변수 잡으면 전역변수
	public static void main(String[] args) {
		int a=10;
		switch(a)
		{
		case 10:
			{int b=100;
			System.out.println("a="+a+",b="+b);
			break;
		    }     //블럭이 끝나면 변수도 사라짐 -> b:지역변수                  
		case 11:
			{int b=200;
			System.out.println("a="+a+",b="+b);
			break;}
		}

	}

}
