package maven.project.project1.ejercicio6.main;

import java.awt.EventQueue;

import maven.project.project1.ejercicio6.window.Windows6;

public class App {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Windows6 window = new Windows6();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
