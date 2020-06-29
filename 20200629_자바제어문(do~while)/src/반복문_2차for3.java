
public class 반복문_2차for3{

	public static void main(String[] args){
		/*   1 1 1 1 1
		 *   2 2 2 2 2
		 *   3 3 3 3 3
		 *   4 4 4 4 4
		 *   5 5 5 5 5
		 */
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++)
			System.out.printf("%2d ",i);
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++)
			System.out.printf("%2c ",i+64);
			System.out.println();
		}
		

		
		/*    1  2  3  4  5
		 *    6  7  8  9 10
		 *   11 12 13 14 15
		 *   16 17 18 19 20
		 *   21 22 23 24 25
		 */
	}

}
