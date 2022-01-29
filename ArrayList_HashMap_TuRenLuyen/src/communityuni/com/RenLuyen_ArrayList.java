package communityuni.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RenLuyen_ArrayList {
	static ArrayList<String> ds = new ArrayList<String>();
	public static void Menu()
	{
		System.out.println("---------- CHƯƠNG TRÌNH QUẢN LÝ TÊN SINH VIÊN ----------");
		System.out.println(" 1. Thêm sinh viên");
		System.out.println(" 2. Xuất danh sách sinh viên");
		System.out.println(" 3. Sửa sinh viên");
		System.out.println(" 4. Xóa sinh viên");
		System.out.println(" 5. Tìm sinh viên");
		System.out.println(" 6. Sắp xếp sinh viên");
		System.out.println(" 7. Xuất số lượng sinh viên");
		System.out.println(" 8. Xuất Menu");
		System.out.println(" 0. Thoát");
	}
	public static void main(String[] args) {
		Menu();
		while(true)
		{
			System.out.print("Chọn chức năng: ");
			int chon = new Scanner(System.in).nextInt();
			switch(chon)
			{
			case 1:
				Them();
				break;
			case 2:
				Xuat();
				break;
			case 3:
				Sua();
				break;
			case 4:
				Xoa();
				break;
			case 5:
				Tim();
				break;
			case 6:
				SapXep();
				break;
			case 7:
				SoLuong();
				break;
			case 8:
				Menu();
				break;
			case 0:
				System.err.println("Cảm ơn bạn đã sử dụng chương trình!");
				System.exit(0);
				break;
			default :
				System.err.println("Sai cú pháp. Vui lòng nhập lại!");
				break;
			}
		}
	}
	private static void Them() {
		System.out.print("Nhập tên sinh viên: ");
		String ten=new Scanner(System.in).nextLine();
		ds.add(ten);
	}
	private static void Xuat() {
		System.out.println("Xuất danh sách sinh viên:");
		for (int i=0;i<ds.size();i++)
		{
			System.out.println((i+1)+". "+ds.get(i));
		}
	}
	private static void Sua() {
		System.out.print("Nhập số thứ tự sinh viên muốn sửa: ");
		int stt = new Scanner(System.in).nextInt();
		for (int i=0;i<ds.size();i++)
		{
			if (stt==i+1)
			{
				System.out.print("Nhập tên mới: ");
				String ten=new Scanner(System.in).nextLine();
				ds.set(i, ten);
			}
		}
	}
	private static void Xoa() {
		System.out.print("Nhập số thứ tự sinh viên muốn sửa: ");
		int stt = new Scanner(System.in).nextInt();
		for (int i=0;i<ds.size();i++)
		{
			if (stt==i+1)
			{
				ds.remove(i);
			}
		}
	}
	private static void Tim() {
		System.out.print("Nhập tên sinh viên muốn tìm: ");
		String ten=new Scanner(System.in).nextLine();
		if (ds.contains(ten))
		{
			System.out.println("Có "+ten+" trong danh sách.");
		}
		else
		{
			System.out.println("Không có "+ten+" trong danh sách.");
		}
	}
	private static void SapXep() {
		Collections.sort(ds);
		System.out.println("Danh sách sinh viên đã được sắp xếp!");
	}
	private static void SoLuong() {
		int dem=0;
		for (int i=0;i<ds.size();i++)
		{
			dem++;
		}
		System.out.println("Danh sách có "+dem+" sinh viên.");
	}

}
