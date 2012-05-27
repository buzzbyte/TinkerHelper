package bot;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Boot {

	/**
	 * @param args
	 */
	public static String botname = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Config");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		botname = (String)JOptionPane.showInputDialog(frame, "Enter bot's name:", "TinkerHelper");

		//If a string was returned, say so.
		if ((botname != null) && (botname.length() > 0)) {
			new TinkerHelper();
		}
	}

}
