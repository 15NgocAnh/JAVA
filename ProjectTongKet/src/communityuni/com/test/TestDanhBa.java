package communityuni.com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import communityuni.com.io.SerializeFile;
import communityuni.com.model.Contact;

public class TestDanhBa {
	static HashMap<Integer, Contact> csdl=new HashMap<Integer, Contact>();
	public static void Menu()
	{
		System.out.println("CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ");
		System.out.println(" 1. Thêm");
		System.out.println(" 2. Xuất");
		System.out.println(" 3. Sửa");
		System.out.println(" 4. Xóa");
		System.out.println(" 5. Tìm");
		System.out.println(" 6. Sắp xếp");
		System.out.println(" 7. Lưu");
		System.out.println(" 8. Đọc");
		System.out.println(" 9. Menu");
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
				Sapxep();
				break;
			case 7:
				Luu();
				break;
			case 8:
				Doc();
				break;
			case 9:
				Menu();
				break;
			case 0:
				System.err.println("Cảm ơn bạn đã sử dụng chương trình. Tạm biệt!");
				System.exit(0);
				break;
			default :
				System.err.println("Sai cú pháp. Vui lòng thử lại!");
				break;
			
			}
		}
	}
	private static void Them() {
		System.out.print("Nhập mã: ");
		int ma=new Scanner(System.in).nextInt();
		System.out.print("Nhập tên: ");
		String ten=new Scanner(System.in).nextLine();
		System.out.print("Nhập số điện thoại: ");
		String sdt=new Scanner(System.in).nextLine();
		
		Contact c=new Contact(ma, ten, sdt);
		if(csdl.containsKey(c.getId())==false)
		{
			csdl.put(c.getId(), c);
		}
	}
	private static void Xuat() {
		System.out.println("Danh sách danh bạ: ");
		for (Map.Entry<Integer, Contact> item : csdl.entrySet())
		{
			System.out.println(item.getValue());
		}
	}
	private static void Sua() {
		System.out.print("Nhập mã muốn sửa: ");
		int ma=new Scanner(System.in).nextInt();
		if (csdl.containsKey(ma))
		{
			System.out.println("Mã "+ma+" tồn tại.");
			System.out.print("Nhập tên mới: ");
			String ten=new Scanner(System.in).nextLine();
			System.out.print("Nhập số điện thoại mới: ");
			String sdt=new Scanner(System.in).nextLine();
			
			Contact c=new Contact(ma, ten, sdt);
			csdl.put(ma, c);
		}
		else
		{
			System.out.println("Mã "+ma+" không tồn tại.");
		}
	}
	private static void Xoa() {
		System.out.print("Nhập mã muốn xóa: ");
		int ma=new Scanner(System.in).nextInt();
		if (csdl.containsKey(ma))
		{
			csdl.remove(ma);
		}
		else
		{
			System.out.println("Mã "+ma+" không tồn tại.");
		}
	}
	private static void Tim() {
		System.out.print("Nhập phone: ");
		String phone=new Scanner(System.in).nextLine();
		for (Map.Entry<Integer, Contact> item : csdl.entrySet())
		{
			if (item.getValue().getPhone().startsWith(phone))
				System.out.println(item.getValue());
		}
	}
	private static void Sapxep() {
		// TODO Auto-generated method stub
		
	}
	private static void Luu() {
		SerializeFile.SaveFile(csdl, "D://DanhBa.dat");
	}
	private static void Doc() {
		csdl=SerializeFile.ReadFile("D://DanhBa.dat");
	}

}
