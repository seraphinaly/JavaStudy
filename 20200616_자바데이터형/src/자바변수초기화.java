
public class �ڹٺ����ʱ�ȭ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int kor=78;
        int eng=85;
        int math=96;
        
        System.out.println("����:"+(kor+eng+math)); //��ȣ ��� �켱
        
        //���ڿ� ���ս� ����!!!
        System.out.println("����:"+kor+eng+math); //����:788596
        /*
         *   7+7+"1"+7+7
         *   =14+"1"+7+7
         *   ="141"+7+7
         *   ="1417"+7
         *   ="14177"
         */
	    
	    int a=65;
	    char c=65; //char=> ����, ���� ��� ���������� ������� ���ڷ� ����
	    System.out.println("a="+a);
	    System.out.println("c="+c);
	
	    int A=97;
	    char C=97;
	    System.out.println("A="+A);
	    System.out.println("C="+C);
	    
	    int d=1;
	    int e='1';
	    System.out.println("d="+d);
	    System.out.println("e="+e);
	    
	    /* long = int ����
	     *  8      4 
	     * int = long ===>error: ���� �Ϳ� ū ���� ���� �� ����
	     *  4      8
	     *  
	     *  double = int, long, float
	     *  int = double (x)
	     *  ���� ) char = int
	     */
	    // byte < char < int < long < float < double
	    
	    System.out.println(100); //100: int
	    System.out.println(10.8); // 10.8: double
	    		
	    long i=21400000000l; //or double
	    System.out.println(i);
	    
	}

}
