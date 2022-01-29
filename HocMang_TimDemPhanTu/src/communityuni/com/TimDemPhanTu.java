package communityuni.com;

import java.util.Scanner;

public class TimDemPhanTu {
	public static void NhapMang(int M[])
	{
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<M.length;i++)
		{
			System.out.print("M["+i+"] = ");
			M[i]=sc.nextInt();
		}
	}
	public static void XuatMang(int M[])
	{
		for (int i=0;i<M.length;i++)
		{
			System.out.print(M[i]+"\t");
		}
	}
	public static void TimPhanTu(int M[], int k)
	{
		boolean Tim = false;
		for (int i=0;i<M.length;i++)
		{
			if (M[i]==k)
			{
				Tim = true;
				break;
			}
		}
		if (Tim==true)
			System.out.println("Phần tử "+k+" có trong Mảng.");
		else
			System.out.println("Phần tử "+k+" không có trong Mảng.");
	}
	public static void DemPhanTu(int M[], int k)
	{
		String s="";
		int dem=0;
		for (int i=0;i<M.length;i++)
		{
			if (M[i]==k)
			{
				s += "M["+i+"]" +"; ";
				dem++;
			}
		}
		if (s.length()>0)
		{
			System.out.println(k+" xuất hiện "+dem+" lần trong Mảng.");
			System.out.println(k+" ở các vị trí: "+s);
		}
		else
			System.out.println(k+" không tìm thấy trong Mảng.");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Mời bạn nhập vào số phần tử tối đa của Mảng: ");
		int n=sc.nextInt();
		int M[] = new int[n];
		System.out.println("Mời bạn nhập các giá trị của Mảng:");
		NhapMang(M);
		System.out.println("Mảng sau khi nhập là:");
		XuatMang(M);
		System.out.println();
		System.out.print("Mời bạn nhập số muốn tìm:");
		int k=sc.nextInt();
		TimPhanTu(M, k);
		DemPhanTu(M, k);
	}

}
