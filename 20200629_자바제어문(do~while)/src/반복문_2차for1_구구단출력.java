
public class 반복문_2차for1_구구단출력{

	public static void main(String[] args){
//		for(int i=1;i<=3;i++) {      //세로 출력(줄 수)
//			for(int j=1;j<=3;j++) {  //가로 출력(몇 개)
//				System.out.println("i="+i+",j="+j);
//		/* i=1 => j=1, j=2, j=3  | i++
//		   i=2 => j=1, j=2, j=3  | i++
//		   i=3 => j=1, j=2, j=3  | i++
//		   i=4=> i<=3: false => 종료
//		 */
//			}
//		}

		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%d*%d=%-2d\t",j,i,j*i);
			}
			System.out.println();
		}
		
	}

}
