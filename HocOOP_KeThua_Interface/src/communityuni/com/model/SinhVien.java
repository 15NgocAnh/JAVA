package communityuni.com.model;

public class SinhVien implements ILamViec, IGiaiTri{

	@Override
	public void complexity() {
		System.out.println("Bài tập phức tạp");
	}

	@Override
	public void difficulty() {
		// TODO Auto-generated method stub
		System.out.println("Học hành khó khăn.");
	}

	@Override
	public void VuiChoi() {
		// TODO Auto-generated method stub
		System.out.println("Giải trí sau giờ học.");
	}
	
}
