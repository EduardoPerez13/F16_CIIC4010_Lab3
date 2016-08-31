import javax.swing.JFrame;

public class Lab3Exercises {
	
	public static void main(String[] args) {

		JFrame Eduardo = new JFrame("Hello, world!");

		Eduardo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		Eduardo.setLocation(860, 440);

		Eduardo.setSize(200, 200);
		
		MyPanelClass myPanel = new MyPanelClass();
        Eduardo.getContentPane().add(myPanel);

		Eduardo.setVisible(true);

	}

}