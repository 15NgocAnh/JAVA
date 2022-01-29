package communityuni.com.test;

import java.util.Scanner;

import communityuni.com.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		System.out.println("Nhập thông tin nhân viên thứ 1:");
		System.out.print("Họ: ");
		String ho1=new Scanner(System.in).nextLine();
		System.out.print("Tên: ");
		String ten1=new Scanner(System.in).nextLine();
		System.out.print("Số SP: ");
		int soSP1=new Scanner(System.in).nextInt();
		
		System.out.println("Nhập thông tin nhân viên thứ 2:");
		System.out.print("Họ: ");
		String ho2=new Scanner(System.in).nextLine();
		System.out.print("Tên: ");
		String ten2=new Scanner(System.in).nextLine();
		System.out.print("Số SP: ");
		int soSP2=new Scanner(System.in).nextInt();;
		
		NhanVien nv1=new NhanVien(ho1, ten1, soSP1);
		NhanVien nv2=new NhanVien(ho2, ten2, soSP2);
		System.out.println("Lương của nhân viên 1 = "+nv1.getLuong());
		System.out.println("Lương của nhân viên 2 = "+nv2.getLuong());
		if (nv1.LonHon(nv2))
			System.out.println("Nhân viên 1 có số sản phẩm nhiều hơn và nhiều hơn "+(nv1.getSoSP()-nv2.getSoSP())+" sản phẩm");
		else
			System.out.println("Nhân viên 2 có số sản phẩm nhiều hơn và nhiều hơn "+(nv2.getSoSP()-nv1.getSoSP())+" sản phẩm");
		/*System.out.println("--------------");
		if (nv1.getSoSP()>nv2.getSoSP())
			System.out.println("Nhân viên 1 có số sản phẩm nhiều hơn và nhiều hơn "+(nv1.getSoSP()-nv2.getSoSP())+" sản phẩm");
		else
			System.out.println("Nhân viên 2 có số sản phẩm nhiều hơn và nhiều hơn "+(nv2.getSoSP()-nv1.getSoSP())+" sản phẩm");
*/
	}

}
