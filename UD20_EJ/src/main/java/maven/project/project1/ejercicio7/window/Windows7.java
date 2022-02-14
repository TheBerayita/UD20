package maven.project.project1.ejercicio7.window;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Windows7 {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_1, btnNewButton;


	/**
	 * Create the application.
	 */
	public Windows7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());

		JLabel lblNewLabel = new JLabel("Precio");
		panel.add(lblNewLabel);
		
		
		textField = new JTextField();
		textField.setColumns(10);
		panel.add(textField);
		

		JLabel lblNewLabel_1 = new JLabel("Total");
		panel.add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		
		frame.add(panel,BorderLayout.NORTH);
		
		JPanel botones = new JPanel();
		btnNewButton = new JButton("Cambiar");
		botones.add(btnNewButton);

		btnNewButton_1 = new JButton("Euros a ptas");
		botones.add(btnNewButton_1);

		frame.add(botones,BorderLayout.CENTER);
		
		
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (btnNewButton_1.getText().equals("Ptas a euros"))
					btnNewButton_1.setText("Euros a ptas");
				else
					btnNewButton_1.setText("Ptas a euros");
			}
		});

		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				float dinero = Float.parseFloat(textField.getText());

				if (btnNewButton_1.getText().equals("Ptas a euros"))
					textField_1.setText(dinero / 166.386 + "");
				else
					textField_1.setText(dinero * 166.386 + "");
			}
		});
	}

}
