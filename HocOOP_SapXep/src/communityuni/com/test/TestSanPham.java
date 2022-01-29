package communityuni.com.test;

import java.util.ArrayList;
import java.util.Collections;

import communityuni.com.model.SanPham;

public class TestSanPham {

	public static void main(String[] args) {
		ArrayList<SanPham> dsSP=new ArrayList<SanPham>();
		SanPham sp1=new SanPham(1, "CoCa", 16.000);
		SanPham sp2=new SanPham(2, "Pepsi", 25.000);
		SanPham sp3=new SanPham(3, "Sting", 13.000);
		dsSP.add(sp1);
		dsSP.add(sp2);
		dsSP.add(sp3);
		System.out.println("Danh sách sản phẩm:");
		for (SanPham sp : dsSP)
			System.out.println(sp);
		System.out.println("Danh sách sản phẩm sau khi sắp xếp:");
		Collections.sort(dsSP);
		for (SanPham sp:dsSP)
			System.out.println(sp);
	}

}
