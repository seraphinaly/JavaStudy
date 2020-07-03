
public class 변수정리_중복x난수발생{

	public static void main(String[] args){
		int[] com=new int[10];
		for(int i=0;i<10;i++) {
			com[i]=(int)(Math.random()*10)+1; //조작	
		}		

		int su=0; //난수값 저장
		//중복 없으면(false) 저장, 중복되면(true) 난수 다시 발생
		boolean bCheck=false; //2가지 경우의 수 → boolean
		for(int i=0;i<10;i++) {
			//중복여부 확인
			bCheck=true;
			while(bCheck) {
				//난수발생
				su=(int)(Math.random()*10)+1;
				//종료 확인
				bCheck=false;
				//비교 → 같은 수가 저장됐는지 확인
				for(int j=0;j<i;j++) {
					if(com[j]==su) {
						bCheck=true;
						break;
					}
				}
			} //while문 종료
			com[i]=su;
		}
		for(int i:com) {
			System.out.print(i+" ");
		}
		
	}

}
