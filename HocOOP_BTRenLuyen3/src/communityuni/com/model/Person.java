package communityuni.com.model;

import java.util.Date;

public abstract class Person implements mammal {
	private String firstName;
	private BloodGroup blood;
	private Address homeAddress;
	private Address schoolAddress;
	
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(Address schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public BloodGroup getBlood() {
		return blood;
	}

	public void setBlood(BloodGroup blood) {
		this.blood = blood;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setDateofBirth(Date dob) 
	{
		
	}

	public int getAgeAsDays() 
	{
		return 0;
	}

}
