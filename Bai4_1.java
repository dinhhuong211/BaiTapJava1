//bai 4 : ucln cua 4 so
import java.util.Scanner;
public class Main{
	
	public static int UCLN(int a, int b){
		if (b==0) return a;
		else return UCLN(b,a%b);
	}
	
	public static void main(String[] args){
		int a, b, c, d, u1, u2, u;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		u1=UCLN(a,b);
		u2=UCLN(c,d);
		u=UCLN(u1,u2);
		System.out.println("UCLN cua 4 so la:" + u);
		
	}
}