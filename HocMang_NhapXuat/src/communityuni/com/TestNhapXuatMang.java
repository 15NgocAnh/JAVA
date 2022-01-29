package communityuni.com;

import java.util.Scanner;

public class TestNhapXuatMang {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int M[];
		System.out.print("Mời bạn nhập phần tử tối đa của Mảng: ");
		int n=sc.nextInt();
		M=new int[n];
		System.out.println("Nhập các phần tử của Mảng: ");
		for (int i=0;i<n;i++)
		{
			System.out.print("M["+i+"] = ");
			M[i]=sc.nextInt();
		}
		//
		System.out.println("Mảng sau khi nhập là: ");
		for (int i=0;i<n;i++)
		{
			System.out.println("M["+i+"] = "+M[i]);
		}
		//
		System.out.println("Mảng sau khi nhập là: ");
		for (int i : M)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
	}

}
