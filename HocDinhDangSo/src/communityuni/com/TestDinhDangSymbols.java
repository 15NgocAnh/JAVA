package communityuni.com;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TestDinhDangSymbols {

	public static void main(String[] args) {
		DecimalFormat dcf=new DecimalFormat("#,###");
		DecimalFormatSymbols dfs=new DecimalFormatSymbols(Locale.getDefault());
		dfs.setGroupingSeparator('.');
		int x = 1234567890;
		dcf.setDecimalFormatSymbols(dfs);
		System.out.println(dcf.format(x));
	}

}
