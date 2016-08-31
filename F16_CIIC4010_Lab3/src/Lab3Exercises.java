import javax.swing.JFrame;

public class Lab3Exercises {
	
	public static void main(String[] args) {

		JFrame Eduardo = new JFrame("Hello, world!");

		Eduardo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		Eduardo.setLocation(860, 440);
		//Eduardo.setLocation(483, 239); *For my laptop resolution*
		
		Eduardo.setSize(400, 290);
		
		MyPanelClass myPanel = new MyPanelClass();
        Eduardo.getContentPane().add(myPanel);

		Eduardo.setVisible(true);

	}

}