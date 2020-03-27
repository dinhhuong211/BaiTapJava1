// bai 5: so fibonacci thu n
import java.util.Scanner;

public class Main{
	public static int fibonacci(int n){
		if (n==1 || n==2) return 1;
		else return fibonacci(n-1) + fibonacci(n-2);
	}
	public static void main(String[] args){
		int n;
		Scanner sc= new Scanner (System.in);
		n = sc.nextInt();
		int x= fibonacci(n);
		System.out.println("So fibonacci can tim:" + x);
	}
}