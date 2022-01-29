package communityuni.com;

import java.util.Scanner;

public class PhepToan {

	public static double Tinh(int x, int n)
	{
		double s = 0;
		double mau = 1;
		for (int i=0;i<=2*n+1;i++)
		{
			double tu = Math.pow(x, 2*i+1);
			int j=1;
			while(j<=2*i+1)
			{
				mau *= j;
				j++;
			}
			s += tu/mau;
		}
		return s;

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhập vào x: ");
		int x=sc.nextInt();
		System.out.print("Nhập vào n: ");
		int n=sc.nextInt();
		double a = Tinh(x,n);
		System.out.println("S("+x+","+n+") = "+a);
	}
}