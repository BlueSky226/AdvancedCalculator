//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class claculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtField;
	String sin;
	double num,num1,sum=0;
	int x=0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					claculator frame = new claculator();
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
	public claculator() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 298, 337);
		contentPane = new JPanel();
		setContentPane(contentPane);
		
	//  public double sum,num;
		

		
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 0, 0, 0);
	//	btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		
		 
		
		
		txtField = new JTextField();
		txtField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		txtField.setBounds(10, 21, 250, 29);
		contentPane.add(txtField);
		txtField.setColumns(10);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+"7");
				
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_7.setBounds(10, 78, 43, 37);
		contentPane.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 txtField.setText(txtField.getText()+"8");
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_8.setBounds(63, 78, 43, 37);
		contentPane.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 txtField.setText(txtField.getText()+"9");
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_9.setBounds(112, 78, 43, 37);
		contentPane.add(btn_9);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+"4");
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_4.setBounds(10, 125, 43, 37);
		contentPane.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    txtField.setText(txtField.getText()+"5");
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_5.setBounds(63, 125, 43, 37);
		contentPane.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 txtField.setText(txtField.getText()+"6");
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_6.setBounds(112, 125, 43, 37);
		contentPane.add(btn_6);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+"1");
				
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_1.setBounds(10, 172, 43, 37);
		contentPane.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+"2");
				
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_2.setBounds(63, 172, 43, 37);
		contentPane.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  txtField.setText(txtField.getText()+"3");
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_3.setBounds(112, 172, 43, 37);
		contentPane.add(btn_3);
		
		JButton btn_add_or_sub = new JButton("+/-");
		btn_add_or_sub.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_add_or_sub.setBounds(10, 214, 66, 37);
		contentPane.add(btn_add_or_sub);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 txtField.setText(txtField.getText()+"0");
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_0.setBounds(80, 214, 66, 37);
		contentPane.add(btn_0);
		
		JButton btn_decimal = new JButton(".");
		btn_decimal.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_decimal.setBounds(151, 214, 59, 37);
		contentPane.add(btn_decimal);
		
		JButton btn_devide = new JButton("/");
		btn_devide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sin="/";
				if(x==0) {
					num1=Double.parseDouble(txtField.getText());
					sum=num1;
					txtField.setText("");
					x=1;
				}else {
					num=Double.parseDouble(txtField.getText());
					txtField.setText("");
					sum=sum/num;
					System.out.println(sum);
					
				}
				
			}
		});
		btn_devide.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_devide.setBounds(164, 78, 43, 37);
		contentPane.add(btn_devide);
		
		JButton btn_mul = new JButton("x");
		btn_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sin="x";
				if(x==0) {
					num1=Double.parseDouble(txtField.getText());
					sum=num1;
					txtField.setText("");
					x=1;
				}else {
					num=Double.parseDouble(txtField.getText());
					txtField.setText("");
					sum=sum*num;
					System.out.println(sum);
				}
				
				
			}
		});
		btn_mul.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_mul.setBounds(164, 124, 43, 37);
		contentPane.add(btn_mul);
		
		JButton btn_sub = new JButton("-");
		btn_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sin="-";
				if(x==0) {
					num1=Double.parseDouble(txtField.getText());
					txtField.setText("");
					x=1;
					sum=num1;
					System.out.println("sum in here="+sum+" x= "+x);
					
				}else {
					num=Double.parseDouble(txtField.getText());
					txtField.setText("");
					sum=sum-num;
					System.out.println("sum="+sum+" x= "+x+"nummmmmm:"+num);
				}	
			}
			
		});
		
		
		btn_sub.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_sub.setBounds(164, 171, 43, 37);
		contentPane.add(btn_sub);
		
	
		JButton btn_add = new JButton("+");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sin="+";
				if(x==0) {
					
					num1=Double.parseDouble(txtField.getText());
					sum=num1;
				txtField.setText("");
					x=1;
				}else {
					
					num=Double.parseDouble(txtField.getText());
					txtField.setText("");
					sum=sum+num;
					System.out.println("summmm"+sum);
				}	
			}
		});
		btn_add.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_add.setBounds(217, 125, 43, 84);
		contentPane.add(btn_add);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Double.parseDouble(txtField.getText());
				if(sin=="+") {
					sum=sum+num;
				}
				else if(sin=="-") {
					sum=sum-num;
				}else if(sin=="/") {
					sum=sum/num;
				}else if(sin=="x") {
					sum=sum*num;
				}
				txtField.setText(Double.toString(sum));
				
			}
		});
		btn_equal.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_equal.setBounds(217, 214, 43, 37);
		contentPane.add(btn_equal);
		
		JButton btn_dell = new JButton("C");
		btn_dell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(null);
				sum=0;
			}
		});
		btn_dell.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_dell.setBounds(217, 78, 43, 37);
		contentPane.add(btn_dell);
	}
}
