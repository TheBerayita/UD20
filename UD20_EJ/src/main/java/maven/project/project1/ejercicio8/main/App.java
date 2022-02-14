package maven.project.project1.ejercicio8.main;

import java.awt.EventQueue;

import maven.project.project1.ejercicio8.window.Windows8;

public class App {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Windows8 window = new Windows8();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
