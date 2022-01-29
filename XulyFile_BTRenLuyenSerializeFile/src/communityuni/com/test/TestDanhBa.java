package communityuni.com.test;

import java.util.ArrayList;
import java.util.Scanner;

import communityuni.com.io.SerializeFileFactory;
import communityuni.com.model.DanhBa;

public class TestDanhBa {
	static ArrayList<DanhBa> dsDB=new ArrayList<DanhBa>();
	public static void Menu()
	{
		System.out.println("----- MENU -----");
		System.out.println(" 1. Nhập danh bạ");
		System.out.println(" 2. Xuất danh bạ");
		System.out.println(" 3. Lưu file danh bạ");
		System.out.println(" 4. Đọc file danh bạ");
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
				System.err.println("Nhập sai cú pháp. Vui lòng nhập lại!");
				break;
			}
		}
	}
	private static void Nhap() {
		System.out.print("Nhập tên: ");
		String ten=new Scanner(System.in).nextLine();
		System.out.print("Nhập SĐT: ");
		int sdt=new Scanner(System.in).nextInt();
		DanhBa db=new DanhBa(ten, sdt);
		dsDB.add(db);
	}
	private static void Xuat() {
		System.out.println("Tên \t Số điện thoại");
		for (DanhBa db : dsDB)
		{
			System.out.println(db);
		}
	}
	private static void LuuFile() {
		if (SerializeFileFactory.SaveFile(dsDB, "D:/DanhBa.dat")==true);
			System.out.println("Lưu File thành công!");
	}
	private static void DocFile() {
		dsDB=(ArrayList<DanhBa>) SerializeFileFactory.ReadFile("D:/DanhBa.dat");
		Xuat();
	}

}
