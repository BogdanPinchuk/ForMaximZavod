package WebObj.Basic.ListOfObj.Buttons;

import WebObj.Basic.AWebObj;

public abstract class AButton extends AWebObj {

	protected String name = null;

	public void pressButton() {
		System.out.println("Button was pressed");
	}

	@Override
	public String checkWebObj() {
		return super.checkWebObj() + "of ";
	}

	@Override
	public void testWebObj() {
		super.testWebObj();

		System.out.println("Tested basic realization of button");
	}

	public String getName() {
		return name;
	}
}
