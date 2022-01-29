package communityuni.com;

import java.util.Scanner;

public class SoHoanThien {
	public static int SHT(int a)
	{
		int tong = 0;
		for (int i=1;i<a;i++)
		{
			if (a%i==0)
				tong += i;
		}
		if (tong==a)
			return 1;
		else
			return 0;
		
	}
	public static void main(String[] args) {
		System.out.println("Tìm số hoàn thiện:");
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.print("Nhập vào một số: ");
		int a=sc.nextInt();
		if (SHT(a)==1)
			System.out.println("Đây là số hoàn thiện.");
		else
			System.out.println("Đây không phải số hoàn thiện.");
		System.out.print("Bạn có muốn tiếp tục không? (c/k): ");
		String line=new Scanner(System.in).nextLine();
		if (line.equalsIgnoreCase("k"))
			break;
		}
		System.out.println("Cảm ơn đã sử dụng!");
	}

}
