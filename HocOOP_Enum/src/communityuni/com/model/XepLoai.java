package communityuni.com.model;

public enum XepLoai {
	Gioi ("Giỏi"),
	Kha ("Khá"),
	TB ("Trung bình"),
	Yeu ("Yếu");
	String msg;

	public String GetDescription() {
		return msg;
	}

	private XepLoai(String msg) {
		this.msg = msg;
	}
	
}
