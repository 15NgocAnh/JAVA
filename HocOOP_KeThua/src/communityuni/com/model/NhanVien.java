package communityuni.com.model;

public class NhanVien {
	protected int ma;
	protected String ten;
	public int getMa() 
	{
		return ma;
	}
	public void setMa(int ma) 
	{
		this.ma = ma;
	}
	public String getTen() 
	{
		return ten;
	}
	public void setTen(String ten) 
	{
		this.ten = ten;
	}
	public NhanVien(int ma, String ten) 
	{
		this.ma = ma;
		this.ten = ten;
	}
	public NhanVien() 
	{
		
	}
	public void TinhLuong()
	{
		System.out.println("Nhân viên "+this.ten+" gọi tính lương.");
	}
}
