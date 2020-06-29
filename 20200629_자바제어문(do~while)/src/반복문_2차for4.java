
public class 반복문_2차for4{

	public static void main(String[] args){
		/*   A
		 *   AB
		 *   ABC
		 *   ABCD
		 *   ABCDE
		 *   ======== 변수 초기값의 위치 확인 중요!
		 *   ABCDE
		 *   ABCD
		 *   ABC
		 *   AB
		 *   A
		 */
		
		char c='A';
		for(int i=1;i<=5;i++) {
			c='A';
			for(int j=1;j<=i;j++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=1;i<=5;i++) {
			c='A';
			for(int j=1;j<=6-i;j++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
		
		/*   1####
		 *   #2###
		 *   ##3##
             ###4#
             ####5
		 */
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i!=j)
					System.out.print('#');
				else
					System.out.print(i);
			}
			System.out.println();
		}
 
	/*	25 24 23 22 21
	 *  20
	 *  16     ...
	 *  10
	 *   5  4  3  2  1
	 */
		System.out.println();
		int k=25; //25~1 변경하는 변수
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("%2d\t",k);
				k--;
			}
			System.out.println();
		}
		
		System.out.println();
		k=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("%2d\t",k);
				k++;
			}
			System.out.println();
		}
//              줄수 (i)  공백 (j)  별표(k)		
//		*****     1        0       5
//		 ****     2        1       4
//		  ***     3        2       3
//		   **     4        3       2
//		    *     5        4       1
//          j+1=i => j=i-1 / i+k=6 => k=6-i		
		
		System.out.println("\n");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=6-i;k++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
//         줄수 (i)  공백 (j)  별표(k)		
//     *     1        4       1
//    **     2        3       2
//   ***     3        2       3
//  ****     4        1       4
// *****     5        0       5
//        i+j=5 => j=i-5 / i=k 
		System.out.println("\n");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		
	}
}	