
public class Main {

	public static void main(String[] args) {
		
		Info info = new Info();
		
		LogPage logPage = new LogPage(info.getLoginInfo());

	}

}




import java.util.HashMap;

public class Info {
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	Info(){
		logininfo.put("Admin","Password");
	}
	protected HashMap getLoginInfo(){
		return logininfo;
	}

}



import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogPage  implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("User:");
	JLabel messageLabel = new JLabel("Pasok mga suki");
	
	JLabel userpassLabel = new JLabel("Password:");
	HashMap<String,String> loginInfo = new HashMap<String,String>();
	
	LogPage(HashMap<String,String> loginInfoOriginal){
		
		loginInfo = loginInfoOriginal;
		
		userIDLabel.setBounds(50,100,75,25);
		userpassLabel.setBounds(50,150,75,25);
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		userIDField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125,150,200,25);
		
		loginButton.setBounds(125,200,100,25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(225,200,100,25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		frame.add(userIDLabel);
		frame.add(userpassLabel);
		frame.add(messageLabel);
		frame.add(resetButton);
		frame.add(userIDField);
		frame.add(loginButton);
		frame.add(userPasswordField);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
		if(e.getSource()==loginButton) {
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
		
		     if(loginInfo.containsKey(userID)) {
		    	 if(loginInfo.get(userID).equals(password)) {
		    		 messageLabel.setText("Login successful");
		    		 frame.dispose();
		    		 HomeP homepage = new HomeP();
		    	 }
		    	 else {
		    		 messageLabel.setText("Wrong Password");
		    	 }
		     }
		     else {
		    	 messageLabel.setText("Username not found");
		     }
		}
	}

}


import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class HomeP {
	
	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("Inom na!");
	
	HomeP(){
		ImageIcon image = new ImageIcon("haha.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		JLabel label = new JLabel();
		
		label.setText("Code God");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0x00FF00));
		label.setFont(new Font("MV Boli",Font.PLAIN, 20));
		label.setIconTextGap(10);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		
		JFrame frame = new JFrame();
		frame.setTitle("POINT OF SALE");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		frame.setSize(420,420);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.add(label);
        ImageIcon image2 = new ImageIcon("ryan.png");
        frame.setIconImage(image2.getImage());
        frame.getContentPane().setBackground(new Color(0x123456));
	}

}
