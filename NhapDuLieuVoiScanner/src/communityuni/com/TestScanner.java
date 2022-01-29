package communityuni.com;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhập vào một số nguyên:");
	int a=sc.nextInt();
	System.out.println("Bạn vừa nhập: "+a);
	System.out.println("Nhập vào một số double:");
	double b=sc.nextDouble();
	System.out.println("Bạn vừa nhập: "+b);
	System.out.println("Nhập vào một chuỗi:");
	String line=new Scanner(System.in).nextLine();
	System.out.println("Bạn vừa nhập: "+line);
	}

}
