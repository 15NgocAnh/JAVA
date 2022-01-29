package communityuni.com.model;

public class NhanVienThoiVu extends NhanVien {

	public NhanVienThoiVu() 
	{
		super();
	}

	public NhanVienThoiVu(int ma, String ten) 
	{
		super(ma, ten);
	}
	public void TinhLuong() 
	{
		super.TinhLuong();
		System.out.println(" => Đây là nhân viên thời vụ.");
	}
}
