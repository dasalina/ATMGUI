package ATMMachine;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ATM extends JFrame {

	private JPanel contentPane;
	private JTextField display;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM frame = new ATM();
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
	
	public ATM() {
		setTitle("ATM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		double currentBalance;
		currentBalance = 0.00;
		
		JButton Button1 = new JButton("1");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = display.getText() + "1";
					display.setText(EnterNumber);
			}
		});
		Button1.setBounds(100, 83, 49, 44);
		contentPane.add(Button1);
		
		JButton Button2 = new JButton("2");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = display.getText() + "2";
				display.setText(EnterNumber);
			}
		});
		Button2.setBounds(155, 82, 49, 44);
		contentPane.add(Button2);
		
		JButton Button3 = new JButton("3");
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = display.getText() + "3";
				display.setText(EnterNumber);
			}
		});
		Button3.setBounds(212, 83, 49, 44);
		contentPane.add(Button3);
		
		JButton Button4 = new JButton("4");
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = display.getText() + "4";
				display.setText(EnterNumber);
			}
		});
		Button4.setBounds(100, 135, 49, 44);
		contentPane.add(Button4);
		
		JButton Button5 = new JButton("5");
		Button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = display.getText() + "5";
				display.setText(EnterNumber);
			}
		});
		Button5.setBounds(156, 135, 49, 44);
		contentPane.add(Button5);
		
		JButton Button6 = new JButton("6");
		Button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = display.getText() + "6";
				display.setText(EnterNumber);
			}
		});
		Button6.setBounds(212, 135, 49, 44);
		contentPane.add(Button6);
		
		JButton Button7 = new JButton("7");
		Button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = display.getText() + "7";
				display.setText(EnterNumber);
			}
		});
		Button7.setBounds(100, 187, 49, 44);
		contentPane.add(Button7);
		
		JButton Button8 = new JButton("8");
		Button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = display.getText() + "8";
				display.setText(EnterNumber);
			}
		});
		Button8.setBounds(156, 187, 49, 44);
		contentPane.add(Button8);
		
		JButton Button9 = new JButton("9");
		Button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = display.getText() + "9";
				display.setText(EnterNumber);
			}
		});
		Button9.setBounds(212, 187, 49, 44);
		contentPane.add(Button9);
		
		JButton Button0 = new JButton("0");
		Button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = display.getText() + "0";
				display.setText(EnterNumber);
			}
		});
		Button0.setBounds(271, 83, 49, 96);
		contentPane.add(Button0);
		
		JButton ButtonDecimal = new JButton(".");
		ButtonDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = display.getText() + ".";
				display.setText(EnterNumber);
			}
		});
		ButtonDecimal.setBounds(271, 187, 49, 44);
		contentPane.add(ButtonDecimal);
		
		JButton ButtonDeposit = new JButton("Deposit");
		ButtonDeposit.setBackground(Color.green);
		ButtonDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentBalance = Double.parseDouble(display.getText()) + currentBalance;
				display.setText(String.valueOf(currentBalance));
			}
		});
		ButtonDeposit.setBounds(10, 83, 80, 44);
		contentPane.add(ButtonDeposit);
		
		JButton ButtonWithdraw = new JButton("Withdraw");
		ButtonWithdraw.setBackground(Color.red);
		ButtonWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentBalance >= Double.parseDouble(display.getText())) {
					currentBalance = currentBalance - Double.parseDouble(display.getText());
					display.setText(String.valueOf(currentBalance));
				}
			}
		});
		ButtonWithdraw.setBounds(10, 135, 80, 44);
		contentPane.add(ButtonWithdraw);
		
		display = new JTextField();
		display.setBounds(52, 21, 307, 37);
		contentPane.add(display);
		display.setColumns(10);
		
		JButton ButtonBal = new JButton("Balance");
		ButtonBal.setBackground(Color.white);
		ButtonBal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = "Balance = " + currentBalance;
				display.setText(EnterNumber);
			}
		});
		ButtonBal.setBounds(10, 187, 80, 44);
		contentPane.add(ButtonBal);
		
		JButton ButtonClear = new JButton("Clear");
		ButtonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = "";
				display.setText(EnterNumber);
			}
		});
		ButtonClear.setBounds(344, 135, 80, 44);
		contentPane.add(ButtonClear);
	}
}
