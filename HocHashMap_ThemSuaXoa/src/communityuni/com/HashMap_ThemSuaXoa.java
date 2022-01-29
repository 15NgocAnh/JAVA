package communityuni.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap_ThemSuaXoa {
	static HashMap<Integer, String> map=new HashMap<Integer, String>();
	public static void Menu()
	{
		System.out.println("---------- MENU TÙY CHỌN ----------");
		System.out.println(" 1. Thêm");
		System.out.println(" 2. Xuất");
		System.out.println(" 3. Sửa");
		System.out.println(" 4. Xóa");
		System.out.println(" 5. Thay thế");
		System.out.println(" 6. Tìm kiếm");
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
				TimKiem();
				break;
			case 6:
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
		System.out.println("Nhập mã sách: ");
		int Ma=new Scanner(System.in).nextInt();
		System.out.println("Nhập tên sách: ");
		String Ten=new Scanner(System.in).nextLine();
		if (map.containsKey(Ma)==false)
		{
			map.put(Ma, Ten);
		}
	}
	private static void Xuat() {
		System.out.println("Mã\tTên Sách");
		for (Map.Entry<Integer, String> item : map.entrySet())
		{
			System.out.println(item.getKey()+"\t"+item.getValue());
		}
	}
	private static void Sua() {
		System.out.println("Nhập mã sách muốn sửa: ");
		int Ma=new Scanner(System.in).nextInt();
		if (map.containsKey(Ma)==false)
		{
			System.out.println("Không chứa mã "+Ma+" trong danh sách.");
		}
		else
		{
			System.out.println("Nhập tên sách mới: ");
			String Ten=new Scanner(System.in).nextLine();
			map.put(Ma, Ten);
		}
	}
	private static void Xoa() {
		System.out.println("Nhập mã sách muốn xóa: ");
		int Ma=new Scanner(System.in).nextInt();
		if(map.containsKey(Ma)==false)
		{
			System.out.println("Không chứa mã "+Ma+" trong danh sách.");
		}
		else
		{
			map.remove(Ma);
		}
	}
	private static void TimKiem() {
		System.out.println("Nhập tên sách muốn tìm: ");
		String Ten=new Scanner(System.in).nextLine();
		for (Map.Entry<Integer, String> item : map.entrySet())
		{
			if (item.getValue().contains(Ten))
			{
				System.out.println(item.getKey()+"\t"+item.getValue());
			}
		}
	}

}
