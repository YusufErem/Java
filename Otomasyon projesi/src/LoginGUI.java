import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginGUI extends JFrame {

	private JPanel wrapper_pane;
	private JTextField txtAsdasd;
	private JTextField txtAsddsa;

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
		setBounds(100, 100, 727, 525);
		wrapper_pane = new JPanel();
		wrapper_pane.setBackground(Color.GRAY);
		wrapper_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(wrapper_pane);
		wrapper_pane.setLayout(null);
		
		JLabel lbllogo = new JLabel(new ImageIcon(getClass().getResource("libarylogo.png")));
		lbllogo.setBounds(262, 24, 157, 94);
		wrapper_pane.add(lbllogo);
		
		JLabel lblNewLabel = new JLabel("K\u00FCt\u00FCphane Otomasyonuna Ho\u015Fgeldiniz");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblNewLabel.setBounds(150, 128, 400, 35);
		wrapper_pane.add(lblNewLabel);
		
		JTabbedPane wrappertabpain = new JTabbedPane(JTabbedPane.TOP);
		wrappertabpain.setBounds(35, 188, 637, 264);
		wrapper_pane.add(wrappertabpain);
		
		JPanel panel = new JPanel();
		wrappertabpain.addTab("Kitap Giriþi", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblKitapAd = new JLabel("Kitap Ad\u0131 :");
		lblKitapAd.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblKitapAd.setBounds(84, 20, 128, 35);
		panel.add(lblKitapAd);
		
		JLabel lblBarkodNo = new JLabel("Barkod No :");
		lblBarkodNo.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblBarkodNo.setBounds(84, 86, 128, 35);
		panel.add(lblBarkodNo);
		
		txtAsdasd = new JTextField();
		txtAsdasd.setText("asdasd");
		txtAsdasd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAsdasd.setBounds(258, 21, 308, 35);
		panel.add(txtAsdasd);
		txtAsdasd.setColumns(10);
		
		txtAsddsa = new JTextField();
		txtAsddsa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAsddsa.setText("asddsa");
		txtAsddsa.setBounds(258, 89, 308, 32);
		panel.add(txtAsddsa);
		txtAsddsa.setColumns(10);
		
		JButton btnNewButton = new JButton("Kitap Ekle");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(84, 163, 137, 35);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Kitap Ekle");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setBounds(420, 163, 137, 35);
		panel.add(btnNewButton_1);
	}
}
