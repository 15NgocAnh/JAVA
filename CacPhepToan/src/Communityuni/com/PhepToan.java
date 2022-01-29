package Communityuni.com;

import java.util.Scanner;

public class PhepToan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while (true)
		{
			System.out.println("Mời bạn nhập vào số a: ");
			int a=sc.nextInt();
			System.out.println("Mời bạn nhập vào số b: ");
			int b=sc.nextInt();
			System.out.println("Mời bạn nhập vào phép toán: ");
			char ch=new Scanner(System.in).nextLine().charAt(0);
			switch(ch)
			{
			case '+' :
				System.out.println(a+" + "+b+" = "+(a+b));
				break;
			case '-':
				System.out.println(a+" - "+b+" = "+(a-b));
				break;
			case '*':
				System.out.println(a+" * "+b+" = "+(a*b));
				break;
			case '/':
				if (b==0)
					System.out.println("Mẫu = 0. Phép toán sai!");
				else
					System.out.println(a+" / "+b+" = "+(a*1.0/b));
				break;
			default :
				System.out.println("Nhập sai cú pháp. Vui lòng nhập lại!");
				break;
			}
			System.out.println("Bạn có muốn tiếp tục không? (c/k): ");
			String line=new Scanner(System.in).nextLine();
			if (line.equalsIgnoreCase("k"))
				break;
		}
		System.out.println("Cảm ơn bạn!");

	}

}
