package communityuni.com.test;

import java.util.ArrayList;

import communityuni.com.io.FileFactory;

public class TestFile {

	public static void main(String[] args) {
		/*ArrayList<String> dsData=new ArrayList<String>();
		dsData.add("Mai Huỳnh Anh");
		dsData.add("Hà Anh Tuấn");
		dsData.add("Nguyễn Thanh Tâm");
		dsData.add("Nguyễn Thị Ngọc Ánh");
		boolean kq=FileFactory.luuFile(dsData, "D:/dulieutext.txt");
		if(kq == true)
		{
			System.out.println("Lưu file thành công.");
		}
		else
		{
			System.out.println("Lưu file thất bại.");
		}*/
		ArrayList<String>dsData=FileFactory.docFile("D:/dulieutext.txt");
		for (String data : dsData)
		{
			System.out.println(data);
		}
	}

}
