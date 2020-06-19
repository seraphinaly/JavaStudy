
public class 자바기본데이터2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("C:\\javaDev\\javaStudy\\20200617_자바출력메소드\\src\\자바기본데이터2.java");
        // 역슬러시 \\ 두개  써야 출력은 \ 하나로 나옴
        
        System.out.println("\"홍길동\"");
        //따옴표 출력시 \"
        
        System.out.print("Hello\t");
        System.out.println("Java!!");
        
        
        double d=123456.78;
        int a= (int)((d-123456)*100); 
        System.out.println(a); //데이터형이 다른 경우 직접 계산해봐야함. double을 float로 바꾸면 정상적으로 나옴.
	}

}
