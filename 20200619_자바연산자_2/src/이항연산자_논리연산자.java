
public class ���׿�����_�������� {

	public static void main(String[] args) {
	    /*��������: ���� (&&, ||) ����
		 *jumsu>=90 && jumsu<=100 //����
		 *jumsu<=0 || jumsu>100    //���� ��� ��
		 */
		
        /*   ���� 1  ���� 2  |  &&     ||
         * -----------------------------
         *   true  true  | true   true
         *   true  false | false  true 
         *   false true  | false  true
         *   false false | false  false
         */
	     System.out.println(6<5 && 10==10); //false
	
	     int a=10;
	     int b=9;
	     
	   //ȿ������ ����: ����2 �ƿ� ����X
	   //&&: ����1 false�϶�
	     System.out.println(a<b && ++b==a); //false 
	     System.out.println(b);             //b=9
	     
	     char c1='A';
	     int i=65;
	     char c2='B';

	     boolean bCheck=c1==i && ++c1==c2;
	     System.out.println(bCheck);  //true
	     System.out.println(c1);      //B, 1 ����; �Ѵ� true�� ��� ����
	       
	   //||: ����1 true�϶�
		 System.out.println(a>b || ++b==a); //true 
		 System.out.println(b); //b=9
	}

}
