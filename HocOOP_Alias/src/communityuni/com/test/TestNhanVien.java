package communityuni.com.test;

import communityuni.com.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVien nv1=new NhanVien(1, "Phùng Khoa Học");
		NhanVien nv2=new NhanVien(2, "Nguyễn Văn Thuận");
		System.out.println("Nhân viên 1: "+nv1.getTen());
		nv1=nv2; //nv1 và nv2 cùng trỏ tới một ô nhớ
		nv2.setTen("Thái Linh Hương");
		System.out.println("Nhân viên 1: "+nv1.getTen());
		System.out.println("------------");
		NhanVien nv3=new NhanVien(3, "Hà");
		NhanVien nv4=new NhanVien(4, "Tuấn");
		nv3=nv4.Copy();
		System.out.println("Nhân viên 3: "+nv3.getTen());
		nv4.setTen("Hải");
		System.out.println("Nhân viên 3: "+nv3.getTen());
		nv3.setTen("Nam");
		System.out.println("Nhân viên 4: "+nv4.getTen());
	}

}
