import java.util.*;
public class ���_�������ǹ� {
    public static void main(String[] args) {
		// ���� �� �� �Է¹޾Ƽ� ���ĺ����� ���� Ȯ��
    	char ch='A';
    	Scanner scan=new Scanner(System.in);
    	System.out.print("���� �Է�:");
    	//"A(0)B(1)C(2)" ; �ڹٴ� ���ڸ� 0���� ����
    	ch= scan.next().charAt(0); //ù��° ���� �ϳ��� ���� ���ڴ�
    	
    	//������ ������ if�� ó��
        if(ch>='0' && ch<='9') {
        	System.out.println(ch+"��(��) �����Դϴ�!");
        } else {
        	System.out.println(ch+"��(��) �����Դϴ�!");
          }
        //���ĺ� ������� �ٲ㺸��
//        if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
//        	System.out.println(ch+"��(��) ���ĺ��Դϴ�!");
//        }
//        	else {
//        		System.out.println(ch+"��(��) ���ĺ��� �ƴմϴ�!");
//            }
        	
	}
}
