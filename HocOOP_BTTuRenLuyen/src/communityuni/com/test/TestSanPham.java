package communityuni.com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import communityuni.com.model.DanhMuc;
import communityuni.com.model.SanPham;

public class TestSanPham {
	static ArrayList<DanhMuc> dsDM = new ArrayList<DanhMuc>();
	static ArrayList<SanPham> dsSP = new ArrayList<SanPham>();
	public static void Menu()
	{
		System.out.println("-----Chương trình quản lý bán hàng-----");
		System.out.println("1. Nhập thông tin danh mục");
		System.out.println("2. Nhập thông tin sản phẩm");
		System.out.println("3. Xuất thông tin sản phẩm");
		System.out.println("4. Cập nhật thông tin sản phẩm");
		System.out.println("5. Xóa sản phẩm trong danh mục");
		System.out.println("6. Thống kê giá trị mặt hàng");
		System.out.println("7. Liệt kê sản phẩm có xuất xứ từ Trung Quốc");
		System.out.println("8. Xuất Menu");
		System.out.println("0. Thoát");
	}
	public static void main(String[] args) {
		Menu();
		while(true)
		{
			System.out.print("Chọn chức năng: ");
			int chon=new Scanner(System.in).nextInt();
			switch(chon)
			{
			case 1:
				NhapDM();
				break;
			case 2:
				NhapSP();
				break;
			case 3:
				Xuat();
				break;
			case 4:
				CapNhat();
				break;
			case 5:
				Xoa();
				break;
			case 6:
				ThongKe();
				break;
			case 7:
				LietKe();
				break;
			case 8:
				Menu();
				break;
			case 0:
				System.err.println("Cảm ơn bạn đã sử dụng chương trình! Tạm biệt!");
				System.exit(0);
				break;
			default :
				System.err.println("Sai cú pháp. Vui lòng nhập lại!");
				break;
			}
		}
	}
	private static void NhapDM() {
		DanhMuc dm=new DanhMuc();
		System.out.print("Nhập mã danh mục: ");
		int ma=new Scanner(System.in).nextInt();
		System.out.print("Nhập tên danh mục: ");
		String ten=new Scanner(System.in).nextLine();
		dm.setMaDM(ma);
		dm.setTenDM(ten);
		dsDM.add(dm);
	}
	private static void NhapSP() {
		System.out.print("Nhập mã danh mục: ");
		int ma=new Scanner(System.in).nextInt();
		System.out.print("Nhập tên danh mục: ");
		String ten=new Scanner(System.in).nextLine();
		
	}
	private static void Xuat() {
		// TODO Auto-generated method stub
		
	}
	private static void CapNhat() {
		// TODO Auto-generated method stub
		
	}
	private static void Xoa() {
		// TODO Auto-generated method stub
		
	}
	private static void ThongKe() {
		// TODO Auto-generated method stub
		
	}
	private static void LietKe() {
		// TODO Auto-generated method stub
		
	}

}
