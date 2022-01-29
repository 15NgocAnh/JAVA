package communityuni.com.model;

import java.io.Serializable;

public class DanhBa implements Serializable{
	private String ten;
	private int sdt;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	public DanhBa(String ten, int sdt) {
		super();
		this.ten = ten;
		this.sdt = sdt;
	}
	public DanhBa() {
		super();
	}
	public String toString() 
	{
		return this.ten+"\t"+this.sdt;
	}
}
