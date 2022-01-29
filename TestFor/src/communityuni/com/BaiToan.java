package communityuni.com;

import java.util.Scanner;

public class BaiToan {
	public static double TinhToan(int x,int n) 
	{
		double s = 0;
		double mau = 0;
		for (int i=1;i<=n;i++)
		{
			double tu = Math.pow(x,i);
			mau += i;
			s += tu/mau;
		}
		return s;
	}
	public static void main(String[] args) 
	{
		System.out.println("Phép toán");
		Scanner sc=new Scanner(System.in);
		System.out.println("Mời bạn nhập vào x: ");
		int x=sc.nextInt();
		System.out.println("Mời bạn nhập vào n: ");
		int n=sc.nextInt();
		double s=TinhToan(x,n);
		System.out.println("S("+x+","+n+") = "+s);
	}

}
