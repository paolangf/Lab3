import javax.swing.JFrame;


public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Paola Guadalupe");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(900, 460);
		myFrame.setSize(240,230);
		MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
	}
}