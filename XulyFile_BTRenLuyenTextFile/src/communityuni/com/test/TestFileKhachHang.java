package communityuni.com.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import communityuni.com.io.FileFactory;
import communityuni.com.model.KhachHang;
import communityuni.com.util.XuLyDate;

public class TestFileKhachHang {
	static ArrayList<KhachHang> dsKH=new ArrayList<KhachHang>();
	public static void Menu()
	{
		System.out.println("------ MENU -----");
		System.out.println(" 1. Nhập thông tin khách hàng");
		System.out.println(" 2. Xuất thông tin khách hàng");
		System.out.println(" 3. Lưu file thông tin khách hàng");
		System.out.println(" 4. Đọc file thông tin khách hàng");
		System.out.println(" 5. Xuất Menu");
		System.out.println(" 0. Thoát");
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
				Nhap();
				break;
			case 2:
				Xuat();
				break;
			case 3:
				LuuFile();
				break;
			case 4:
				DocFile();
				break;
			case 5:
				Menu();
				break;
			case 0:
				System.err.println("Cảm ơn bạn đã sử dụng chương trình. Tạm biệt!");
				System.exit(0);
				break;
			default :
				System.err.println("Sai cú pháp. Vui lòng nhập lại!");
				break;
			}
		}
	}
	private static void Nhap() {
		System.out.println("Nhập mã khách hàng: ");
		int ma=new Scanner(System.in).nextInt();
		System.out.println("Nhập tên khách hàng: ");
		String ten=new Scanner(System.in).nextLine();
		System.out.println("Nhập ngày tháng năm sinh(dd/MM/yyyy): ");
		Date ns=XuLyDate.fromString(new Scanner(System.in).nextLine());
		KhachHang kh=new KhachHang(ma, ten, ns);
		dsKH.add(kh);
	}
	private static void Xuat() {
		System.out.println("Mã\tHọ và tên\tNăm sinh");
		for (KhachHang kh: dsKH)
		{
			System.out.println(kh);
		}
	}
	private static void LuuFile() {
		if (FileFactory.saveFile(dsKH, "D://DulieuKH.txt")==true)
			System.out.println("Lưu file thành công.");
	}
	private static void DocFile() {
		dsKH=FileFactory.readFile("D://DulieuKH.txt");
	}

}
