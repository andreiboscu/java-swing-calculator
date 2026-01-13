package lab7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Calculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("0");
		btnNewButton.setBounds(30, 215, 84, 27);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(124, 215, 84, 27);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnC);
		
		JButton btnC_1 = new JButton("=");
		btnC_1.setBounds(218, 215, 84, 27);
		frame.getContentPane().add(btnC_1);
		
		JButton btnC_1_1 = new JButton("+");
		btnC_1_1.setBounds(312, 215, 84, 27);
		frame.getContentPane().add(btnC_1_1);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(30, 178, 84, 27);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.setBounds(124, 178, 84, 27);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.setBounds(218, 178, 84, 27);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("-");
		btnNewButton_4.setBounds(312, 181, 84, 27);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.setBounds(30, 144, 84, 27);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("5");
		btnNewButton_6.setBounds(124, 144, 84, 27);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("6");
		btnNewButton_7.setBounds(218, 144, 84, 27);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("*");
		btnNewButton_8.setBounds(312, 144, 84, 27);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("7");
		btnNewButton_9.setBounds(30, 107, 84, 27);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("8");
		btnNewButton_10.setBounds(124, 107, 84, 27);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("9");
		btnNewButton_11.setBounds(218, 110, 84, 27);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("/");
		btnNewButton_12.setBounds(312, 110, 84, 27);
		frame.getContentPane().add(btnNewButton_12);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("123 + 7");
		textField.setBounds(73, 24, 297, 73);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String comand= ((JButton)e.getSource()).getText();	
				
				if(comand.equals("C")){
					textField.setText("");//reset
				} else if (comand.equals("=")) {
					try {
				        String expr = textField.getText().trim();// curata de spatii la inceput sau la final
				        String[] parts = expr.split(" ");// parts[0] = "123", parts[1] = "+", parts[2] = "7"
				        if (parts.length != 3) {
				            textField.setText("Eroare");
				            return;
				        }
				        double operand1 = Double.parseDouble(parts[0]); // convertește primul operand (un text) într-un număr real (double)
				        String operator = parts[1];// salvează operatorul („+”, „-”, „*” sau „/”)
				        double operand2 = Double.parseDouble(parts[2]);;// convertește al doilea operand într-un double
				        double result = 0;// aici va fi stocat rezultatul
				        switch (operator) {
			            case "+": result = operand1 + operand2; break;
			            case "-": result = operand1 - operand2; break;
			            case "*": result = operand1 * operand2; break;
			            case "/":
			                if (operand2 == 0) {
			                    textField.setText("Împărțire la 0!");
			                    return;
			                }
			                result = operand1 / operand2;
			                break;
			            default:
			                textField.setText("Operator necunoscut");
			                return;
			        }
				     // afișează rezultatul
				        textField.setText(String.valueOf(result));

					}
					catch (Exception ex) {
				        textField.setText("Eroare");
				    }
				}
				else if ("+-*/".contains(comand)) {
		            // Operator → cu spații
		            textField.setText(textField.getText() + " " + comand + " ");
		        }
		        else {
		            // Cifră → fără spații
		            textField.setText(textField.getText() + comand);
		        }
			}
		};
		btnNewButton.addActionListener(listener);
		btnNewButton_1.addActionListener(listener);
		btnNewButton_2.addActionListener(listener);
		btnNewButton_3.addActionListener(listener);
		btnNewButton_4.addActionListener(listener);
		btnNewButton_5.addActionListener(listener);
		btnNewButton_6.addActionListener(listener);
		btnNewButton_7.addActionListener(listener);
		btnNewButton_8.addActionListener(listener);
		btnNewButton_9.addActionListener(listener);
		btnNewButton_10.addActionListener(listener);
		btnNewButton_11.addActionListener(listener);
		btnNewButton_12.addActionListener(listener);
		btnC.addActionListener(listener);
		btnC_1.addActionListener(listener);
		btnC_1_1.addActionListener(listener);
		

				
	}
}
