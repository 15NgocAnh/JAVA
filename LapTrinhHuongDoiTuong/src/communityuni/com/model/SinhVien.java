package communityuni.com.model;

public class SinhVien {
	private String hoTen;
	private double diem;
	public void setHoTen(String hoTen)
	{
		this.hoTen=hoTen;
	}
	public String getHoTen()
	{
		return hoTen;
	}
	public void setDiem(double diem)
	{
		this.diem=diem;
	}
	public double getDiem()
	{
		return diem;
	}
	public SinhVien(String hoTen, double diem)
	{
		this.hoTen=hoTen;
		this.diem=diem;
		System.out.println("Đây là constructor có đối số.");
	}
	public SinhVien()
	{
		System.out.println("Đây là constructor mặc định.");
		this.hoTen="ABC";
		this.diem= 5;
	}
	public void XuatThongTin()
	{
		System.out.println(this.hoTen+" -> "+this.diem);
	}
	@Override
	public String toString() {
		return "Họ tên: "+this.hoTen+"\nĐiểm: "+this.diem;
	}
}
