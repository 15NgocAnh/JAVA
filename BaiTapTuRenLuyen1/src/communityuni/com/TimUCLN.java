package communityuni.com;

import java.util.Scanner;

public class TimUCLN {
	public static int UCLN(int n, int m)
	{
		while (n!=0 && m!=0)
		{
			if (n>m)
				n -= m;
			else
				m -= n;
		}
		if (n==0)
			return m;
		else
			return n;
	}
	public static void main(String[] args) {
		System.out.println("Tìm ước chung lớn nhất của hai số.");
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhập vào số a: ");
		int a=sc.nextInt();
		System.out.print("Nhập vào số b: ");
		int b=sc.nextInt();
		int s = UCLN(a,b);
		System.out.print("Ước chung lớn nhất của "+a+" và "+b+" là: "+s);
	}

}
