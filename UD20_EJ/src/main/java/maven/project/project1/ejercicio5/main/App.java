package maven.project.project1.ejercicio5.main;

import java.awt.EventQueue;

import maven.project.project1.ejercicio5.window.Windows5;

public class App {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Windows5 window = new Windows5();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
