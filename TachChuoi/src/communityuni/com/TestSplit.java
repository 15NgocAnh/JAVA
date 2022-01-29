package communityuni.com;

public class TestSplit {

	public static void main(String[] args) {
		String s="MS102.Nguyễn Ngọc Khánh An.46K25,2";
		//String []arr=s.split(";");
		String []arr=s.split("\\.");
		if(arr.length==3)
		{
			System.out.println("MSSV: "+arr[0]);
			System.out.println("Tên SV: "+arr[1]);
			System.out.println("Tên lớp: "+arr[2]);
		}
		
		System.out.println("--------------");
		for (int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		System.out.println("--------------");
		for (String x : arr)
			System.out.println(x);
	}

}
