//bai 9: tim max cua 3 so- toan tu 3 ngoi
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int a,b,c;
		Scanner sc= new Scanner (System.in);
		a=sc.nexInt();
		b=sc.nexInt();
		c=sc.nexInt();
		int max=a;
		if (a<b) max= (b>c)? b:c;
		System.out.println("So lon nhat la:"+ max);
	}
}
