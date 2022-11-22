import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Calcu extends JFrame {

	private JPanel contentPane;
	private final JButton btnNewButton_2 = new JButton("9");
	private final JButton btnNewButton_7 = new JButton("2");
	private final JButton btnNewButton_11 = new JButton("*");
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcu frame = new Calcu();
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
	public Calcu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		textField = new JTextField();
		textField.setBounds(10, 10, 415, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					textField.setText(textField.getText()+"7");
				
			}
		});
		btnNewButton.setBounds(30, 60, 50, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		btnNewButton_1.setBounds(110, 60, 50, 40);
		contentPane.add(btnNewButton_1);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		btnNewButton_2.setBounds(190, 60, 50, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		btnNewButton_3.setBounds(30, 110, 50, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		btnNewButton_4.setBounds(110, 110, 50, 40);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		btnNewButton_5.setBounds(190, 110, 50, 40);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		btnNewButton_6.setBounds(30, 160, 50, 40);
		contentPane.add(btnNewButton_6);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		btnNewButton_7.setBounds(110, 160, 50, 40);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		btnNewButton_8.setBounds(190, 160, 50, 40);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		btnNewButton_9.setBounds(110, 209, 50, 43);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton(".");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		btnNewButton_10.setBounds(30, 210, 50, 40);
		contentPane.add(btnNewButton_10);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Add a number");
				}
				else
				{
					textField.setText(textField.getText()+"*");
				}
			}
		});
		btnNewButton_11.setBounds(270, 60, 50, 40);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Add a number");
				}
				else
				{
					textField.setText(textField.getText()+"-");
				}
			}
		});
		btnNewButton_12.setBounds(270, 110, 50, 40);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("/");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Add a number");
				}
				else
				{
					textField.setText(textField.getText()+"/");
				}
			}
		});
		btnNewButton_13.setBounds(270, 160, 50, 40);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] str=new String[2];
				if(textField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"No number present");
				}
				if(textField.getText().contains("+"))
				{
					str=textField.getText().split("\\+");
					double x=Double.parseDouble(str[0]);
					double y=Double.parseDouble(str[1]);
					double z=x+y;
					textField.setText(str[0]+" + "+str[1]+" = "+z);
				}
				if(textField.getText().contains("-"))
				{
					str=textField.getText().split("-");
					double x=Double.parseDouble(str[0]);
					double y=Double.parseDouble(str[1]);
					double z=x-y;
					textField.setText(str[0]+" - "+str[1]+" = "+z);
				}
				if(textField.getText().contains("*"))
				{
					str=textField.getText().split("\\*");
					double x=Double.parseDouble(str[0]);
					double y=Double.parseDouble(str[1]);
					double z=x*y;
					textField.setText(str[0]+" * "+str[1]+" = "+z);
				}
				if(textField.getText().contains("/"))
				{
					str=textField.getText().split("/");
					double x=Double.parseDouble(str[0]);
					double y=Double.parseDouble(str[1]);
					double z=x/y;
					textField.setText(str[0]+" / "+str[1]+" = "+z);
				}
			}
		});
		btnNewButton_14.setBounds(270, 210, 50, 40);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("+");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Add a number");
				}
				else
				{
					textField.setText(textField.getText()+"+");
				}
			}
		});
		btnNewButton_15.setBounds(190, 210, 50, 40);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("Clear");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_16.setBounds(340, 110, 85, 54);
		contentPane.add(btnNewButton_16);
		
		
		
		
	}
}
