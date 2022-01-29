package communityuni.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestTinhTuoi {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		int yearnow=cal.get(Calendar.YEAR);
		
		System.out.print("Mời bạn nhập ngày tháng năm sinh (dd/mm/yyyy): ");
		String ns=new Scanner(System.in).nextLine();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date birthday=sdf.parse(ns);
			//Đổi ngày tháng năm
			cal.setTime(birthday);
			int yearNS=cal.get(Calendar.YEAR);
			
			int tuoi = yearnow - yearNS;
			System.out.println("Bạn "+tuoi+" tuổi.");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
