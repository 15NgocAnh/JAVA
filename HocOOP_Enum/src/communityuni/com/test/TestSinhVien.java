package communityuni.com.test;

import java.util.ArrayList;

import communityuni.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		SinhVien sv1=new SinhVien(1, "Anh", 6);
		SinhVien sv2=new SinhVien(2, "An", 9);
		SinhVien sv3=new SinhVien(3, "Mi", 4);
		SinhVien sv4=new SinhVien(4, "Nam", 7.5);
		ArrayList<SinhVien> ds=new ArrayList<SinhVien>();
		ds.add(sv1);
		ds.add(sv2);
		ds.add(sv3);
		ds.add(sv4);
		System.out.println("Danh sách sinh viên:");
		for (SinhVien sv : ds)
		{
			System.out.println(sv);
		}
	}

}
