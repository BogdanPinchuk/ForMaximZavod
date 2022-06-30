package WebObj.Basic;

import java.util.Random;

public abstract class AWebObj implements IWebObject {

	public String checkWebObj() {
		// some basic realization
		// this only for example
		return "Checked basic realization ";
	}

	public void testWebObj() {
		// some basic realization
		System.out.println("Tested basic realization ");
	}

	public boolean isExist() {
		// only for example
		return new Random().nextBoolean();
	}
}
