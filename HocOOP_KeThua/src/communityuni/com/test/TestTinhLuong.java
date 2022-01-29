package communityuni.com.test;

import communityuni.com.model.NhanVien;
import communityuni.com.model.NhanVienChinhThuc;
import communityuni.com.model.NhanVienThoiVu;

public class TestTinhLuong {

	public static void main(String[] args) {
		NhanVien nv1=new NhanVienChinhThuc(1, "Ngô Hải Nam");
		NhanVien nv2=new NhanVienThoiVu(2, "Hứa Minh Đạt");
		nv1.TinhLuong();
		nv2.TinhLuong();
	}

}
