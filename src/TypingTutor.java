import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {

	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JLabel label = new JLabel();
	static char currentLetter;
	
	static TypingTutor t = new TypingTutor();

	public static void main(String[] args) {

		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setSize(100, 100);
		frame.setVisible(true);
		label.setVisible(true);
		panel.setVisible(true);
		
		panel.add(label);
		frame.add(panel);
	
		t.setup();
		frame.pack();

	}

	public void setup() {
		frame.addKeyListener(this);
	}

	static char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());

		if (e.getKeyChar() == currentLetter) {
			System.out.println("correct");
			panel.setBackground(Color.GREEN);
		}

		else {
			
			System.out.println("incorrect");
			panel.setBackground(Color.RED);
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);

	}
}
