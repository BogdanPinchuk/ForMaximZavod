package WebObj.Basic.ListOfObj.Pictures;

import WebObj.Basic.AWebObj;

public class Picture extends AWebObj {
	private final String name = "Photo";

	public String getName() {
		return name;
	}

	public void showImage() {
		System.out.println("Image was opened");
	}

	public void convertImage() {
		System.out.println("Image was converted");
	}

	@Override
	public void testWebObj() {
		super.testWebObj();
		showImage();
		checkWebObj();
	}
}
