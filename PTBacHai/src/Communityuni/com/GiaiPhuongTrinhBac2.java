package Communityuni.com;

import java.util.Scanner;
public class GiaiPhuongTrinhBac2 {
	/**
	 * Giải phương trình bậc 2: ax^2 + bx + c = 0
	 * @param a - hệ số a
	 * @param b - hệ số b
	 * @param c - hệ số c
	 */
	public static void giaiPTB2(double a,double b,double c) {

		if (a==0)
		{
			System.out.println("Trở thành phương trình bậc một.");
			if (b==0 && c==0)
			{
				System.out.println("Phương trình có vô số nghiệm.");
			}
			else if (b==0 && c!=0)
			{
				System.out.println("Phương trình vô nghiệm.");
			}
			else 
			{
				System.out.println("Phương trình có nghiệm x = "+ (-c/b));
			}
		}
		else
		{
			double delta = b*b - 4*a*c;
			if (delta<0)
			{
				System.out.println("Phương trình vô nghiệm.");
			}
			else if (delta==0)
			{
				System.out.println("Phương trình có nghiệm kép x1 = x2 = "+ (-b/(2*a)));
			}
			else
			{
				double x1 = (-b + Math.sqrt(delta))/(2*a);
				double x2 = (-b - Math.sqrt(delta))/(2*a);
				System.out.println("Phương trình có hai nghiệm phân biệt: ");
				System.out.println("x1 = "+ x1);
				System.out.println("x2 = "+ x2);
			}
		}
	}
	public static void main(String[] args) {
			System.out.println("GIẢI PHƯƠNG TRÌNH BẬC 2");
			Scanner sc=new Scanner(System.in);
			do {
			System.out.println("Nhập vào a: ");
			double a=sc.nextDouble();
			System.out.println("Nhập vào b: ");
			double b=sc.nextDouble();
			System.out.println("Nhập vào c: ");
			double c=sc.nextDouble();
			giaiPTB2(a, b, c);
			System.out.println("Bạn có muốn tiếp tục không? (c/k):");
			String line=new Scanner(System.in).nextLine();
			if (line.equalsIgnoreCase("k"))
				break;
		}
		while (true);
		System.out.println("Cảm ơn bạn đã sử dụng!");
		
	}

}
