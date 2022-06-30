package WebObj.Basic.ListOfObj.Buttons;

public class RoundButton extends AButton {

	public RoundButton() {
		this.name = "Round Button";
	}

	public void changeColor() {
		System.out.println("Button was changed of color");
	}

	@Override
	public String checkWebObj() {
		return super.checkWebObj() + getName();
	}

	@Override
	public void testWebObj() {
		super.testWebObj();
		pressButton();
		changeColor();
	}
}
