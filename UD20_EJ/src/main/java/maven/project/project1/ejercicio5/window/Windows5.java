package maven.project.project1.ejercicio5.window;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class Windows5 {

	public JFrame frame;
	private JTextArea textArea;
	private JButton btnNewButton;



	/**
	 * Create the application.
	 */
	public Windows5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textArea = new JTextArea("Texto por defecto");
		frame.getContentPane().add(textArea, BorderLayout.CENTER);
		
		btnNewButton = new JButton("Limpiar");
		frame.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textArea.setText("");
			}
		});
		
		textArea.addMouseListener(new MouseListener() {
			
			
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				textArea.setText(textArea.getText()+" mouseReleased ");
			}
			
			
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				textArea.setText(textArea.getText()+" mousePressed ");
			}
			
			
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				textArea.setText(textArea.getText()+" mouseExited ");
			}
			
			
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				textArea.setText(textArea.getText()+" mouseEntered ");
			}
			
			
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				textArea.setText(textArea.getText()+" mouseClicked ");
			}
		});
	}

}
