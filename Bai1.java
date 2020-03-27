// bai 1: tinh dien tich hinh thang
import java.util.Scanner;
public class Main {
	public static void main (String[] args){
		float a,b,h,S;
		Scanner sc=new Scanner(System.in);
		a= sc.nextFloat();
		b= sc.nextFloat();
		h= sc.nextFloat();
		S= (a+b)*h/2;
		System.out.print("Dien tich hinh thang la:"+ S);
	}
}