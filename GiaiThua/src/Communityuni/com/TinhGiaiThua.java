package Communityuni.com;

import java.util.Scanner;

public class TinhGiaiThua {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập vào giai thừa muốn tính:");
		int n=sc.nextInt();
		int gt = 1;
		int i = 1;
		while (i<=n)
		{
			gt *= i;
			i++;
		}
		System.out.println("Kết quả là:");
		System.out.println(n+"! = "+gt);
	}

}
