package communityuni.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RenLuyen_HashMap {
	static HashMap<Integer, String> ds=new HashMap<Integer, String>();
	public static void Menu()
	{
		System.out.println("--------- CHƯƠNG TRÌNH QUẢN LÝ MÃ VÀ TÊN SINH VIÊN ----------");
		System.out.println(" 1. Thêm sinh viên");
		System.out.println(" 2. Xuất danh sách");
		System.out.println(" 3. Sửa sinh viên");
		System.out.println(" 4. Xóa sinh viên");
		System.out.println(" 5. Tìm sinh viên");
		System.out.println(" 6. Xuất mã sinh viên");
		System.out.println(" 7. Xuất tên sinh viên");
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
				XuatDs();
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
				XuatMa();
				break;
			case 7:
				XuatTen();
				break;
			case 8:
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
	private static void Them() {
		System.out.print("Nhập mã sinh viên: ");
		int ma=new Scanner(System.in).nextInt();
		System.out.print("Nhập tên sinh viên: ");
		String ten=new Scanner(System.in).nextLine();
		if (ds.containsKey(ma)==false)
		{
			ds.put(ma, ten);
		}
	}
	private static void XuatDs() {
		System.out.println("Mã\tTên sinh viên");
		for (Map.Entry<Integer, String> item : ds.entrySet())
		{
			System.out.println(item.getKey()+"\t"+item.getValue());
		}
	}
	private static void Sua() {
		System.out.print("Nhập mã sinh viên muốn sửa: ");
		int ma=new Scanner(System.in).nextInt();
		if (ds.containsKey(ma))
		{
			System.out.print("Nhập tên sinh viên mới: ");
			String ten=new Scanner(System.in).nextLine();
			ds.put(ma, ten);
		}
		else
		{
			System.out.println("Không có mã "+ma+" trong danh sách.");
		}
	}
	private static void Xoa() {
		System.out.print("Nhập mã sinh viên muốn xóa: ");
		int ma=new Scanner(System.in).nextInt();
		if (ds.containsKey(ma))
		{
			ds.remove(ma);
		}
		else
		{
			System.out.println("Không có mã "+ma+" trong danh sách.");
		}
	}
	private static void Tim() {
		System.out.print("Nhập tên sinh viên muốn tìm: ");
		String ten=new Scanner(System.in).nextLine();
		for (Map.Entry<Integer, String> item : ds.entrySet())
		{
			if(item.getValue().contains(ten))
			{
				System.out.println(item.getKey()+"\t"+item.getValue());
			}
		}
	}
	private static void XuatMa() {
		System.out.println("Mã sinh viên");
		for (Map.Entry<Integer, String> item : ds.entrySet())
		{
			System.out.println(item.getKey());
		}
	}
	private static void XuatTen() {
		System.out.println("Tên sinh viên");
		for (Map.Entry<Integer, String> item : ds.entrySet())
		{
			System.out.println(item.getValue());
		}
	}

}
