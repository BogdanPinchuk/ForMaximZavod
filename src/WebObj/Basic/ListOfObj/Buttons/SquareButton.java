package WebObj.Basic.ListOfObj.Buttons;

public class SquareButton extends AButton {

	public SquareButton() {
		name = "Square Button";
	}

	public void changeSize() {
		System.out.println("Button was changed of size");
	}

	public void changePosition() {
		System.out.println("Button was changed of position");
	}

	@Override
	public String checkWebObj() {
		return super.checkWebObj() + getName() + " with border";
	}

	@Override
	public void testWebObj() {
		super.testWebObj();
		pressButton();
		changeSize();
		changePosition();
	}
}
