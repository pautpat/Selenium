package WindowsAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class NotePad {

	public static void main(String[] args) throws IOException, AWTException,
			InterruptedException {
		// TODO Auto-generated method stub

		// Launch the notepad

		Runtime.getRuntime().exec("notepad.exe"); // For calculator use calc.exe

		// Robot is an instance class
		Robot r = new Robot();
		// Click on File Menu
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_ALT);

		Thread.sleep(5000);
		// Click on new in file menu
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

		// Enter the data to Clipboard
		StringSelection x = new StringSelection("HELLO WORLD");
		// Copy to clip board
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
		// Paste the data into Notepad Window
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);

		// Opening the file menu
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(5000);

		// Click on Save
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);


		// Sending the data to clipboard
		StringSelection s = new StringSelection("notepad.txt");

		// Getting the data from clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		// Pasting the name in the filename text box
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);

		// Click on new in save option
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

		// Closing the notepad window
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);

		Thread.sleep(5000);

		// Enter some data

		// OPen file Menu / select option save as

		// give filenam and click Save Close the notepad window

	}

}
