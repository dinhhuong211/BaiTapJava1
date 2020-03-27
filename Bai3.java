// bai 3: chu vi dien tich hinh tron;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		float r, c, s;
		float pi = 3.14f;
		Scanner sc= new Scanner(System.in);
		r= sc.nextFloat();
		c= 2*pi*r;
		s= pi*r*r;
		System.out.println("Chu vi duong tron la:"+ c);
		System.out.println("Dien tich hinh tron la:"+ s);
	}
}