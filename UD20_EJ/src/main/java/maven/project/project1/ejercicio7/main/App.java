package maven.project.project1.ejercicio7.main;

import java.awt.EventQueue;

import maven.project.project1.ejercicio7.window.Windows7;

public class App {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Windows7 window = new Windows7();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
