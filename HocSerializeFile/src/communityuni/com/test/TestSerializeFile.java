package communityuni.com.test;

import java.util.ArrayList;

import communityuni.com.io.SerializeFileFactory;
import communityuni.com.model.KhachHang;

public class TestSerializeFile {

	public static void main(String[] args) {
		ArrayList<KhachHang> dsKH=new ArrayList<KhachHang>();
		dsKH.add(new KhachHang(1, "Huyền"));
		dsKH.add(new KhachHang(2, "Trân"));
		dsKH.add(new KhachHang(3, "Thương"));
		dsKH.add(new KhachHang(4, "Thái"));
		boolean kq=SerializeFileFactory.luuFile(dsKH, "D:/TestSerializeFileKH.txt");
		if (kq==true)
		{
			System.out.println("Lưu file thành công.");
		}
		else
		{
			System.out.println("Lưu file thất bại.");
		}
		/*Object data=SerializeFileFactory.docFile("D:/SerializeFile.txt");
		ArrayList<KhachHang>dsKH=(ArrayList<KhachHang>) data;
		for (KhachHang kh:dsKH)
			System.out.println(kh.getMa()+" - "+kh.getTen());*/
	}
	
}
