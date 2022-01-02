import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class LoginGUI extends JFrame {

	private JPanel wrapper_pane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		wrapper_pane = new JPanel();
		wrapper_pane.setBackground(Color.GRAY);
		wrapper_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(wrapper_pane);
		wrapper_pane.setLayout(null);
		
		JLabel lbllogo = new JLabel(new ImageIcon(getClass().getResource("libarylogo.png")));
		lbllogo.setBounds(224, 27, 113, 72);
		wrapper_pane.add(lbllogo);
		
		JLabel lblNewLabel = new JLabel("K\u00FCt\u00FCphane Otomasyonuna Ho\u015Fgeldiniz");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblNewLabel.setBounds(78, 115, 400, 35);
		wrapper_pane.add(lblNewLabel);
	}
}
