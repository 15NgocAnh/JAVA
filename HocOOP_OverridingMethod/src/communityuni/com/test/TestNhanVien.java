package communityuni.com.test;

import communityuni.com.model.NhanVien;
import communityuni.com.model.NhanVienChinhThuc;
import communityuni.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVien nv1=new NhanVienChinhThuc();
		nv1.TinhLuong(15);
		NhanVien nv2=new NhanVienChinhThuc();
		nv2.TinhLuong(25);
		NhanVien nv3=new NhanVienThoiVu();
		nv3.TinhLuong(25);
	}

}
