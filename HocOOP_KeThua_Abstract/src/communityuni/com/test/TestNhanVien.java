package communityuni.com.test;

import communityuni.com.model.NhanVien;
import communityuni.com.model.NhanVienChinhThuc;
import communityuni.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVien nv1=new NhanVienChinhThuc(1, "Nhàn");
		NhanVien nv2=new NhanVienThoiVu(2, "Hà");
		nv1.tinhLuong();
		nv2.tinhLuong();
	}

}
