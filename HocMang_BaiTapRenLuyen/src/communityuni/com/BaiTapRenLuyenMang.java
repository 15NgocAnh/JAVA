package communityuni.com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BaiTapRenLuyenMang {
	private static void NhapMang(int M[])
	{
		Random rd=new Random();
		for (int i=0;i<M.length;i++)
		{
			M[i]=rd.nextInt(100);
		}
	}
	private static void XuatMang(int []M)
	{
		for (int i=0;i<M.length;i++)
		{
			System.out.print(M[i]+"\t");
		}
		System.out.println();
	}
	private static int TinhTong(int M[])
	{
		int tong=0;
		for (int i=0;i<M.length;i++)
		{
			tong += M[i];
		}
		return tong;
	}
	private static void XuatHien(int M[], int k)
	{
		int dem=0;
		for (int i=0;i<M.length;i++)
		{
			if (M[i]==k)
			{
				dem++;
			}
		}
		if (dem>0)
			System.out.println(k+" xuất hiện "+dem+" lần trong Mảng.");
		else
			System.out.println(k+" không xuất hiện trong Mảng.");
	}
	private static int GTLN(int M[])
	{
		int max = M[0];
		for (int i=0;i<M.length;i++)
		{
			if (M[i]>max)
				max = M[i];
		}
		return max;
	}
	private static int GTNN(int M[])
	{
		int min = M[0];
		for (int i=0;i<M.length;i++)
		{
			if (M[i]<min)
				min = M[i];
		}
		return min;
	}
	private static void SoNguyenTo(int M[])
	{
		System.out.println("Số nguyên tố có trong mảng là:");
		for (int i=0;i<M.length;i++) 
		{
			int dem=0;
			for (int j=1;j<=M[i];j++) 
			{
				if (M[i]%j==0)
					dem++;
			}
			if (dem==2)
				System.out.print(M[i]+"\t");
		}
		System.out.println();
	}
	private static void GiamDan(int M[])
	{
		for (int i=0;i<M.length-1;i++)
		{
			for (int j=M.length-1;j>0;j--)
			{
				if (M[j]>M[j-1])
				{
					int temp = M[j];
					M[j] = M[j-1];
					M[j-1] = temp;
				}
			}
		}
	}
	private static void Menu()
	{
		System.out.println("---------- MENU TÙY CHỌN ----------");
		System.out.println("\t1. Tính tổng mảng.");
		System.out.println("\t2. Số K xuất hiện bao nhiêu lần trong mảng.");
		System.out.println("\t3. Tìm phần tử lớn nhất.");
		System.out.println("\t4. Tìm phần tử nhỏ nhất.");
		System.out.println("\t5. Liệt kê số nguyên tố có trong mảng.");
		System.out.println("\t6. Sắp xếp mảng tăng dần.");
		System.out.println("\t7. Sắp xếp mảng giảm dần.");
		System.out.println("\t8. Xem Menu.");
		System.out.println("\t0. Thoát chương trình.");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int chon;
		System.out.print("Mời bạn nhập vào số phần tử của Mảng: ");
		int n=sc.nextInt();
		int M[]= new int[n];
		NhapMang(M);
		System.out.println("Mảng sau khi nhập ngẫu nhiên là:");
		XuatMang(M);
		Menu();
		do
		{
			System.out.print("Chọn chức năng: ");
			chon=sc.nextInt();
			switch(chon)
			{
			case 1: 
				int s=TinhTong(M);
				System.out.println("Tổng Mảng = "+s);
				break;
			case 2: 
				System.out.print("Nhập số K muốn tìm trong Mảng: ");
				int k=sc.nextInt();
				XuatHien(M, k);
				break;
			case 3:
				int max=GTLN(M);
				System.out.println("Max(M) = "+max);
				break;
			case 4:
				int min=GTNN(M);
				System.out.println("Min(M) = "+min);
				break;
			case 5:
				SoNguyenTo(M);
				break;
			case 6:
				Arrays.sort(M);
				System.out.println("Mảng sắp xếp tăng dần là:");
				XuatMang(M);
				break;
			case 7:
				GiamDan(M);
				System.out.println("Mảng sắp xếp giảm dần là:");
				XuatMang(M);
				break;
			case 8:
				Menu();
				break;
			case 0:
				System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
				break;
			default : 
				System.out.println("Nhập sai cú pháp. Vui lòng nhập lại!");
				break;
			
			}
		}
		while(chon>0&&chon<9);
	}

}
