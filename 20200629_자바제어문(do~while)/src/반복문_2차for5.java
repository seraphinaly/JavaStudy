

public class 반복문_2차for5{

	public static void main(String[] args){
		System.out.println("=====1=====");
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5-i; j++){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("\n=====2=====");
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print(i);
			}
			for(int k=1; k<=6-i; k++){
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("\n=====3=====");
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j);
			}
			for(int k=1; k<=6-i; k++){
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("\n=====4=====");
		for(int i=1; i<=5; i++){
			for(int j=1; j<=6-i; j++){
				System.out.print(i);
			}
			for(int k=1; k<=i; k++){
				System.out.print(" ");
			}
			System.out.println();
		}
		
	
		
		
	}

}
