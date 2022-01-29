package communityuni.com.test;

import communityuni.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		SinhVien Obama=new SinhVien();
		SinhVien putin=new SinhVien("Ngọc Ánh", 9.5);
		System.out.println("Họ tên: "+putin.getHoTen());
		System.out.println("Điểm: "+putin.getDiem());
		System.out.println(Obama.getHoTen());
		System.out.println("----------------");
		putin.XuatThongTin();
		System.out.println("----------------");
		System.out.println(Obama);
	}

}
