package communityuni.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_ThemSuaXoa {
	static ArrayList<Integer> dsData=new ArrayList<Integer>();
	public static void Menu()
	{
		System.out.println("---------- MENU TÙY CHỌN ----------");
		System.out.println(" 1. Thêm");
		System.out.println(" 2. Xuất");
		System.out.println(" 3. Sửa");
		System.out.println(" 4. Xóa");
		System.out.println(" 5. Tìm kiếm");
		System.out.println(" 6. Sắp xếp");
		System.out.println(" 7. Xuất Menu");
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
				Menu();
				break;
			case 0:
				System.err.println("Cảm ơn bạn đã sử dụng chương trình!");
				System.exit(0);
				break;
			default :
				System.out.println("Sai cú pháp. Vui lòng nhập lại!");
				break;
			}
		}
	}
	private static void SapXep() {
		Collections.sort(dsData);
		System.out.println("Danh sách đã được sắp xếp!");
	}
	private static void Tim() {
		System.out.println("Nhập giá trị muốn tìm:");
		int k=new Scanner(System.in).nextInt();
		if (dsData.contains(k)==true)
			System.out.println("Giá trị "+k+" có trong danh sách.");
		else
			System.out.println("Giá trị "+k+" không có trong danh sách.");
	}
	private static void Xoa() {
		System.out.println("Nhập vị trí muốn xóa: ");
		int vt=new Scanner(System.in).nextInt();
		dsData.remove(vt);
	}
	private static void Sua() {
		System.out.println("Nhập vị trí muốn sửa: ");
		int vt=new Scanner(System.in).nextInt();
		System.out.println("Giá trị mới là: ");
		int values = new Scanner(System.in).nextInt();
		dsData.set(vt, values);
	}
	private static void Xuat() {
		for (int i=0;i<dsData.size();i++)
		{
			System.out.print(dsData.get(i)+" ");
		}
		System.out.println();
	}
	private static void Them() {
		System.out.print("Nhập giá trị muốn thêm: ");
		int values =new Scanner(System.in).nextInt();
		dsData.add(values);
	}

}
