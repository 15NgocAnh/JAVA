package communityuni.com;

import java.util.Scanner;
		/* Chuỗi Panlyndrome là chuỗi mà viết xuôi viết ngược đều giống nhau
			VD: radar, madam,... */
public class TestChuoiPanLyndrome {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhập vào chuỗi muốn test: ");
		String s=sc.nextLine();
		char []arr=s.toCharArray();
		boolean flag=true;
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]!=arr[arr.length-1-i])
			{
				flag=false;
				break;
			}
		}
		if (flag==true)
			System.out.println(s+" là chuỗi Panlyndrome");
		else
			System.out.println(s+ " không phải là chuỗi Panlyndrome");
	}

}
