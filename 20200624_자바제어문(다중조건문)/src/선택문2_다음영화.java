import java.util.*;
public class ���ù�2_������ȭ {
	public static void main(String[] args) throws Exception {
		int menu=0;
		Scanner scan=new Scanner(System.in);
		System.out.println(
				"===== �޴� =====\n"
				+"Ȩ(1)\n�����(2)\n��������(3)\n�ڽ����ǽ�(4)\n��������(5)\n����(6)\n"
				+"==============="
				);
		System.out.print("�޴��� �����ϼ���.");
		menu=scan.nextInt();
		
		switch(menu) {
			case 1:
				Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe https://movie.daum.net/main/new#slide-2-0");
				break;
			case 2:
				Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe https://movie.daum.net/premovie/released");
				break;
			case 3:
				Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe https://movie.daum.net/premovie/scheduled");
				break;
			case 4:
				Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe https://movie.daum.net/boxoffice/weekly");
				break;
			case 5:
				Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe https://ticket2.movie.daum.net/Movie/MovieMain.aspx#seq=1");
				break;
			case 6:
				Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe https://movie.daum.net/magazine/new");
				break;
			default:
				System.out.println("�޴��� �������� �ʽ��ϴ�.");
			
		}
	}
}
