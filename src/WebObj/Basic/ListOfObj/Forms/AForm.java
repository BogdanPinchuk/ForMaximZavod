package WebObj.Basic.ListOfObj.Forms;

import WebObj.Basic.AWebObj;

public abstract class AForm extends AWebObj {
	protected String name = null;
	protected Integer dimensionX = 0;
	protected Integer dimensionY = 0;

	public String getTypeOfForm() {
		return "The type is ";
	}

	public void writeText() {
		System.out.println("Something text was written");
	}

	@Override
	public String checkWebObj() {
		return super.checkWebObj() + "of form for ";
	}

	@Override
	public void testWebObj() {
		super.testWebObj();
		System.out.println("Tested basic realization of form");
	}

	public String getName() {
		return "The form for " + name;
	}
}
