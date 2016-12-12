package text;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hospital {

	private JFrame frame;
	private JTextField textName;
	private JTextField textPwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hospital window = new Hospital();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hospital() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textName = new JTextField();
		textName.setBounds(137, 60, 66, 21);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		JLabel lblMessage = new JLabel("");
		lblMessage.setBounds(73, 146, 211, 15);
		frame.getContentPane().add(lblMessage);
		
		JButton btnSubmit = new JButton("\u63D0\u4EA4");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			lblMessage.setText("Hello " + textName.getText() + "!");
			}
			
		});
		btnSubmit.setBounds(159, 177, 93, 23);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblName = new JLabel("\u7528\u6237\u540D");
		lblName.setBounds(73, 63, 54, 15);
		frame.getContentPane().add(lblName);
		
		JLabel lblPwd = new JLabel("\u5BC6\u7801");
		lblPwd.setBounds(73, 102, 54, 15);
		frame.getContentPane().add(lblPwd);
		
		textPwd = new JTextField();
		textPwd.setBounds(137, 99, 66, 21);
		frame.getContentPane().add(textPwd);
		textPwd.setColumns(10);
		
		
	}
}
