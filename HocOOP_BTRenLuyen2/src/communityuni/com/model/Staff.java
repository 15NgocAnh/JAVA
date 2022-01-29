package communityuni.com.model;

import java.util.ArrayList;

public class Staff {
	private ArrayList<StaffMember> staffList;

	public ArrayList<StaffMember> getStaffList() {
		return staffList;
	}

	public void setStaffList(ArrayList<StaffMember> staffList) {
		this.staffList = staffList;
	}
	public Staff(ArrayList<StaffMember> staffList) {
		super();
		this.staffList = staffList;
	}
	
	public Staff() {
		super();
	}

	public void addStaffMember(StaffMember sm)
	{
		staffList.add(sm);
	}
	public void payDay()
	{
		for(StaffMember sm : staffList)
		{
			System.out.println(sm);
		}
	}
}
