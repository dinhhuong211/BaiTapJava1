// bai 2: tinh chu vi, dien tich tam giac
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		float a,b,c,h,S,C;
		Scanner sc=new Scanner(System.in);
		a= sc.nextFloat();
		b= sc.nextFloat();
		c= sc.nextFloat();
		h= sc.nextFloat();
		C= a+b+c;
		System.out.println("Chu vi tam giac la:"+ C);
		S= c*h/2;
		System.out.println("Dien tich tam giac la:"+ S);
	}
}