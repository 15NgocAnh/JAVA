package communityuni.com.model;

public class NhanVienChinhThuc extends NhanVien {

	public void TinhLuong(int ngayCong) {
		if (ngayCong>20)
			System.out.println("Lương nhận được 20 triệu.");
		else
			System.out.println("Lương nhận được 10 triệu.");
	}
}