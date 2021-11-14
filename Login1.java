/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatchat;

/**
 *
 * @author Dinesh
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Here in this code two types of actionListener methods used!!
 */

class Login1 extends JFrame implements ActionListener{
	JLabel l,f;
	JTextField t1;
	JPasswordField t2;
	String user,pwd;
	Login1() {
		Label l = new 	Label("Login Page");
		l.setAlignment(Label.CENTER);
		l.setBackground(Color.black);
		l.setForeground(Color.white);
		l.setBounds(180,50,110,30);
		add(l);
		
		JLabel l1 = new JLabel("Username: ");
		l1.setBounds(100,100,110,30);
		add(l1);
		
		JLabel l2 = new JLabel("Password: ");
		l2.setBounds(100,150,110,30);
		add(l2);
		
		t1 =  new JTextField(20);
		t1.setBounds(180,100,150,30);
		add(t1);
		
		
		t2 = new JPasswordField(20);
		t2.setBounds(180,150,150,30);
		add(t2);
		
		JButton b1 = new JButton("reset");
		b1.setBounds(120,210,80,30);
		
		//method-1 for adding an actionListener
		b1.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e1)
					{
						t1.setText(null);
						t2.setText(null);
					}
				}
				);
		add(b1);

		JButton b2 = new JButton("login");
		//adding an action listener: method-2
		b2.addActionListener(this);
		b2.setBounds(220,210,80,30);
		add(b2);
		
		f = new JLabel("");
		f.setBounds(120,250,200,30);
		add(f);
		
		
		setSize(450,350);
		setLayout(null);
		setVisible(true);
		getContentPane().setBackground(Color.cyan);
	}
	
	//method-2 for adding an actonListener
	public void actionPerformed(ActionEvent e2) {
		user = t1.getText();
		pwd = new String(t2.getPassword());
		
		if(!user.isEmpty() || !pwd.isEmpty()) {
			
			if(user.equals("java") && pwd.equals("pwd123")) {
				
				f.setText("Welcome to the Java World!");
			} 
			else
			{
				f.setText("Invalid Username or Password!");
				t1.setText(null);
				t2.setText(null);
			}
		}
		else {
			f.setText("Enter something in the text area");
		}
		
	}
	public static void main(String arg[]) {
		new Login1();
	}

}
