package Communityuni.com;

import java.util.Scanner;

public class KiemTraNamNhuan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập năm muốn kiểm tra: ");
		int a=sc.nextInt();
		if ((a%4==0 && a%100!=0)||a%400==0)
		{
			System.out.println("Đây là năm nhuần.");
		}
		else
		{
			System.out.println("Đây không phải là năm nhuần.");
		}
	}

}
