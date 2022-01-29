package communityuni.com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SapXepMang {
	public static void NhapMang(int M[])
	{
		Random rd=new Random();
		for (int i=0;i<M.length;i++)
		{
			M[i]=rd.nextInt(100);
		}
	}
	public static void XuatMang(int M[])
	{
		for (int i=0;i<M.length;i++)
		{
			System.out.print(M[i]+"\t");
		}
		System.out.println();
	}
	public static void BubbleSort(int M[])
	{
		for (int i=0;i<M.length-1;i++)
		{
			for (int j=M.length-1;j>i;j--)
			{
				if (M[j]<M[j-1])
				{
					int temp;
					temp = M[j];
					M[j] = M[j-1];
					M[j-1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Mời bạn nhập vào số phần tử mảng: ");
		int n=sc.nextInt();
		int M[]= new int[n];
		NhapMang(M);
		System.out.println("Mảng sau khi nhập ngẫu nhiên là:");
		XuatMang(M);
		//Arrays.sort(M);
		BubbleSort(M);
		System.out.println("Mảng sau khi sắp xếp là:");
		XuatMang(M);
	}

}
