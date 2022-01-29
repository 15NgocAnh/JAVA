package communityuni.com.model;

public class Executive extends Employee {
	private double bonus;
	public void awardBonus(double bonus)
	{
		this.bonus=bonus;
		System.out.println("Nhận bonus: "+this.bonus);
	}
	public double Pay() {
		return super.Pay()+this.bonus;
	}
}
