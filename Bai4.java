// bai 4: ucln cua 2 so
import java.util.Scanner;
public class Main{
	
	public static int UCLN(int a, int b){
		if (b==0) return a;
		else return UCLN(b,a%b);
	}
	
	public static void main(String[] args){
		int a,b,u;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		u= UCLN(a,b);
		System.out.println("Ucln cua hai so la:"+ u);
		
	}
}