package communityuni.com.test;

import communityuni.com.model.Employee;
import communityuni.com.model.Executive;
import communityuni.com.model.Staff;

public class TestStaff {

	public static void main(String[] args) {
		Staff st = new Staff();
		Employee teo=new Employee();
		teo.setName("Nguyễn Văn Tèo");
		teo.setAddress("Quận 1");
		teo.setPhone("123");
		teo.setPayRate(0.12);
		teo.setSocialSecutiyyNumber("SEC123");
		
		st.addStaffMember(teo);
		
		Employee ty=new Employee();
		ty.setName("Trần Thị Tí");
		ty.setAddress("Quận 2");
		ty.setPhone("456");
		ty.setPayRate(0.14);
		ty.setSocialSecutiyyNumber("SEC456");
		
		st.addStaffMember(ty);
		
		Executive an=new Executive();
		an.setName("Hồ Văn An");
		an.setAddress("Quận 3");
		an.setPhone("789");
		an.setPayRate(0.17);
		an.setSocialSecutiyyNumber("SEC789");
		an.awardBonus(100);
		
		st.addStaffMember(an);
		
		st.payDay();
	}

}
