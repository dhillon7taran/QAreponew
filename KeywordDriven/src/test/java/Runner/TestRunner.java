package Runner;

import KeywordDriven.KeywordDriven;
import TestBase.TestBase;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TestBase base = new TestBase();
		KeywordDriven kd = new KeywordDriven();
		
		kd.readdata();
	}

}
