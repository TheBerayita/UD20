package maven.project.project1.ejercicio4.main;

import java.awt.EventQueue;

import maven.project.project1.ejercicio4.window.Windows4;

public class App {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Windows4 window = new Windows4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
