// bai 8: thong tin hoc sinh
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		String hvt,msv,sdt;
		Scanner sc= new Scanner (System.in);
		hvt= sc.nextLine();
		msv= sc.nextLine();
		sdt= sc.nextLine();
		System.out.println("Ho va ten:"+ hvt);
		System.out.println("Ma sinh vien la:"+ msv);
		System.out.println("So dien thoai:"+ sdt);
	}
}