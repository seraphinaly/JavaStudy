
public class ���ڿ�5_split{

	public static void main(String[] args){
		
		String msg= "�ع���,���ι���,��/��,�,����Ʈ,��/����?��/��/��,ǻ��,��ġ/����/���,���/�ҽ�/��,���,������,����,��,����,��/����/��,��Ÿ";
		String[] arr=msg.split("\\?"); //�Ϲ� ���ڿ�=> �迭�� ����
		//msg.sp=>regex : ������ ���� ���
		for(String s:arr) {
			System.out.println(s);
		}
		
		
		
		
		
	}
}
