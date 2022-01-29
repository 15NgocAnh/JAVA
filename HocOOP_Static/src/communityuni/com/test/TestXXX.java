package communityuni.com.test;

import communityuni.com.model.XXX;

public class TestXXX {

	public static void main(String[] args) {
		XXX a=new XXX();
		a.setA(113);
		XXX b=new XXX();
		System.out.println(b.getA());
		XXX c=new XXX();
		c.setA(456);
		System.out.println(a.getA());
		
		XXX.fn1();
	}

}
