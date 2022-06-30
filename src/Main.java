import WebObj.Basic.IWebObject;
import WebObj.Basic.ListOfObj.Buttons.AButton;
import WebObj.Basic.ListOfObj.Buttons.RoundButton;
import WebObj.Basic.ListOfObj.Buttons.SquareButton;
import WebObj.Basic.ListOfObj.Forms.WebForm;
import WebObj.Basic.ListOfObj.Pictures.Picture;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println("\nExample of code for Maxim");

		// collect of list all web object
		List<IWebObject> webObjects = new ArrayList<>();
		webObjects.add(new RoundButton());
		webObjects.add(new SquareButton());
		webObjects.add(new WebForm());
		webObjects.add(new Picture());

		System.out.println("\nList of buttons:\n");
		// check all buttons
		for (IWebObject webObject : webObjects) {
			if (webObject instanceof AButton) {
				System.out.println(webObject.getName());
			}
		}

		System.out.println("\nAre exist web-objects and check it:\n");
		// check all web-objects is exist
		for (IWebObject webObject : webObjects) {
			System.out.print(webObject.getName() + ": ");
			System.out.println(webObject.isExist());
			System.out.println(webObject.checkWebObj());
		}

		// testing all web-objects
		System.out.println("\nTesting of web-objects:\n");
		for (IWebObject webObject : webObjects) {
			System.out.println("\n" + webObject.getName() + ": ");
			webObject.testWebObj();
		}
	}
}
