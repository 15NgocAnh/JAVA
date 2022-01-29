package communityuni.com.model;

public class Employee extends StaffMember {
	protected String socialSecutiyyNumber;
	protected double payRate;

	public String toString() {
		return super.toString()+"\t"+socialSecutiyyNumber+"\t"+payRate;
	}

	public double Pay() {
		return 500;
	}

	public String getSocialSecutiyyNumber() {
		return socialSecutiyyNumber;
	}

	public void setSocialSecutiyyNumber(String socialSecutiyyNumber) {
		this.socialSecutiyyNumber = socialSecutiyyNumber;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	
}
