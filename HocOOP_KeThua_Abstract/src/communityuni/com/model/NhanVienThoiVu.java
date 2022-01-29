package communityuni.com.model;

public class NhanVienThoiVu extends NhanVien{

	public NhanVienThoiVu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienThoiVu(int ma, String ten) {
		super(ma, ten);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		System.out.println("Nhân viên thời vụ tính lương");
	}

}
