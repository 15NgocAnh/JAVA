package communityuni.com.model;

public class SanPham extends DanhMuc {
	private int maSP;
	private String tenSP;
	private double gia;
	private String xuatXu;
	public int getMaSP() {
		return maSP;
	}
	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public String getXuatXu() {
		return xuatXu;
	}
	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}
	public SanPham(int maDM, String tenDM, int maSP, String tenSP, double gia, String xuatXu) {
		super(maDM, tenDM);
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.gia = gia;
		this.xuatXu = xuatXu;
	}
	public SanPham(int maDM, String tenDM) {
		super(maDM, tenDM);
	}
	
}
