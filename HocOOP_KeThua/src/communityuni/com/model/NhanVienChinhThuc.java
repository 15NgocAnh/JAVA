package communityuni.com.model;

public class NhanVienChinhThuc extends NhanVien {

	public NhanVienChinhThuc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienChinhThuc(int ma, String ten) {
		super(ma, ten);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void TinhLuong() {
		// TODO Auto-generated method stub
		super.TinhLuong();
		System.out.println(" => Đây là nhân viên chính thức.");
	}
}
