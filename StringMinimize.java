import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StringMinimize extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StringMinimize frame = new StringMinimize();
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
	public StringMinimize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(84, 45, 249, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Click");
		btnNewButton.addActionListener(new ActionListener() {
			char []c;
			public void actionPerformed(ActionEvent e) {
				String str=textField.getText();
				c=new char[str.length()];
				c[0]=str.charAt(0);
				int j=1;
				for(int i=0;i<str.length();i++)
				{
					if(c[j-1]==str.charAt(i))
					{
						continue;
					}
					c[j]=str.charAt(i);
					j++;
				}
				String str1=new String(c);
				textField.setText(str1);
			}
		});
		btnNewButton.setBounds(173, 105, 85, 21);
		contentPane.add(btnNewButton);
	}

}
