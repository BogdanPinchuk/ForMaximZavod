package WebObj.Basic.ListOfObj.Forms;

public class WebForm extends AForm {
	{
		name = "Web view";
	}

	public WebForm(int sizeX, int sizeY) {
		this.dimensionX = sizeX;
		this.dimensionY = sizeY;
	}

	/**
	 * Default form size
	 */
	public WebForm() {
		this(100, 100);
	}

	@Override
	public void writeText() {
		System.out.println("Something text was written using " + name);
	}

	@Override
	public String checkWebObj() {
		return super.checkWebObj() + getName();
	}

	@Override
	public void testWebObj() {
		super.testWebObj();
		writeText();
	}
}
